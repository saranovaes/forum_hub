package chall.proj.forum_hub.infra.errors;

public class RegisterException extends RuntimeException {
    public RegisterException(String message) {
        super(message);
    }
}