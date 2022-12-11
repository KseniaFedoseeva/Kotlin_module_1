class Case<T>(var item: T): Storage<T> {

    override fun get(): T {
       return item
    }

    override fun add(item: T) {
        this.item = item

    }
}