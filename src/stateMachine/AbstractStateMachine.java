package stateMachine;

public abstract class AbstractStateMachine implements IStateMachine {
    boolean isBusy = true;

    @Override
    public boolean isBusy(){
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

}
