package model.observe.notification;

import model.common.Coord;
import model.pieces.PieceIHM;

import java.util.List;

/**
 * Created by Anis on 29/04/2016.
 */
public class EchecNotification extends Notification {

    public EchecNotification(Coord cInit, Coord cFinal, List<PieceIHM> etatJeu) {
        super(cInit,cFinal,etatJeu);
    }


}