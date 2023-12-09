class Bob {

    String hey(String input) {
        String trimmedInput = input.trim();
        if (trimmedInput.equals(input.toUpperCase())
                && !input.isBlank()) {
            if (trimmedInput.charAt(trimmedInput.length()-1) != '?') {
                return "Whoa, chill out!";
            } else {
                return "Calm down, I know what I'm doing!";
            }
        } else if (!input.isBlank()
                && (trimmedInput.charAt(trimmedInput.length()-1) == '?')
                && !input.equals(input.toUpperCase())) {
            return "Sure.";
        } else if (input.isBlank()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }

}