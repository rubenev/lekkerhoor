package stateMachine;

public class Done extends AbstractStateMachine {
    String message;

    public Done(String message) {
        this.message = message;
    }

    @Override
    public void reset() {
        setBusy(true);
    }

    @Override
    public void update(float dt) {
        setBusy(false);
    }


}
