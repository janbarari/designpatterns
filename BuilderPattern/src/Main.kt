
fun main() {
    val mehdi = Person
        .name("Mehdi")
        .family("Janbarari")
        .age(24)
        .build()

    println(mehdi.toString())
}

class Person {

    private var name: String
    private var family: String
    private var age: Int = 0

    constructor(name: String, family: String, age: Int) {
        this.name = name
        this.family = family
        this.age = age
    }

    override fun toString(): String {
        return "name: $name, family: $family, age: $age"
    }

    companion object PersonBuilder {

        private lateinit var name: String
        private lateinit var family: String
        private var age: Int = 0

        fun name(name: String): PersonBuilder {
            this.name = name
            return this
        }

        fun family(family: String): PersonBuilder {
            this.family = family
            return this
        }

        fun age(age: Int): PersonBuilder {
            this.age = age
            return this
        }

        fun build(): Person {
            return Person(name, family, age)
        }

    }

}