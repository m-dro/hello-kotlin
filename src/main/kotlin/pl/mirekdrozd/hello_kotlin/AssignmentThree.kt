package pl.mirekdrozd.hello_kotlin

    fun String?.isEmptyOrNull(): Boolean {
        return this == null || this.isEmpty()
    }
