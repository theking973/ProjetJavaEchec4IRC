package model.moveStrategy;

import model.common.Deplacement;

public class MoveFou implements IMoveStrategy {

	private static MoveFou instance;
	
	private MoveFou() {
	}
	
	public static MoveFou getInstance(){
		if (instance == null) {
            instance = new MoveFou();
        }

        return instance;
	}

    @Override
    public boolean isMoveOk(Deplacement dep) {
        boolean ret = false;

        if (Math.abs(dep.cFinal.y - dep.cInit.y) == Math.abs(dep.cFinal.x - dep.cInit.x)) {
            ret = true;
        }

        return ret;
    }

}
