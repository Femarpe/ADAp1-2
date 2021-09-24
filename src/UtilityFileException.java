public class UtilityFileException extends Exception {

    UtilityFileException() {
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Unexpected token";
    }
}
