package pl.mirekdrozd.hello_kotlin

class AssignmentOne {

    /*
    A valid identifier is a non-empty string that starts with
    - a letter
    - underscore
    - and consists of only letters, digits and underscores.
     */
    fun isValidIdentifier(text: String): Boolean {
        fun startsWithLetter(text: String): Boolean {
            if (!text.isNullOrEmpty()){
                val firstChar = text[0]
                return firstChar in 'a'..'z' || firstChar in 'A'..'Z'
            }
            return false
        }

        fun containsLettersDigitsUnderscoresOnly(text: String): Boolean {
            for (char in text){
                if (char !in CharRange('a', 'z')
                    && char !in CharRange('A', 'Z')
                    && char !in CharRange('0','9')
                    && char != '_') return false
            }
            return true
        }

        return (startsWithLetter(text) || text.startsWith('_')) && containsLettersDigitsUnderscoresOnly(text)
    }

    fun isValidIdentifierSimpler(text: String): Boolean {
        if (text.isEmpty() || text[0].isDigit()) return false
        for (item in text) {
            if (!item.isLetterOrDigit() && item != '_') return false
        }
        return true
    }

    }