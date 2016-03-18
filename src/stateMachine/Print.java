package stateMachine;

public class Print extends AbstractStateMachine {
    String message;

    public Print(String message) {
        this.message = message;
    }

    @Override
    public void reset() {
        setBusy(true);
    }

    @Override
    public void update(float dt) {
        System.out.println(message);
        setBusy(false);
    }
}

