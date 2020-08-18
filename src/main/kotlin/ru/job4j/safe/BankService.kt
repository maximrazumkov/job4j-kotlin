package ru.job4j.safe

class BankService (
        private val users : HashMap<User, ArrayList<Account>>
) {

    fun addUser(user : User) {
        users.putIfAbsent(user, ArrayList());
    }

    fun findByRequisite(passport : String, requisite : String) : Account? {
        val user = findByPassport(passport)
        return users.get(user)?.find { it.requisite == requisite }
    }

    fun addAccount(passport : String, account : Account) {
        val user = findByPassport(passport);
        users.get(user)?.add(account);
    }

    fun findByPassport(passport : String) = users.keys.find {it.passport == passport}

    fun transferMoney(
            srcPassport : String, srcRequisite : String, destPassport : String,
            descRequisite : String, amount : Double) : Boolean
    {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        val rsl = source != null && dest != null;
        if (rsl) {
            source?.balance =- amount
            dest?.balance =+ amount
        }
        return rsl
    }
}

fun main() {
    var bank = BankService(HashMap())
    bank.addUser(User("321", "Petr Arsentev", "3211"))
    var user = bank.findByPassport("3211")
    System.out.println(user)
    user = bank.findByPassport("321")
    System.out.println(user?.username)
}