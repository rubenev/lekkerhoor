package stateMachine;

import java.util.concurrent.Callable;

public class Wait extends AbstractStateMachine {
    Callable<Boolean> condition;

    public Wait(Callable<Boolean> condition) {
        this.condition = condition;
    }

    @Override
    public void reset() {
        setBusy(true);
    }

    @Override
    public void update(float dt) {
        try {
            if(condition.call()){
                setBusy(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

