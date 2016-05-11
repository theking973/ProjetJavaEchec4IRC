package model.pieces;

import model.common.Coord;
import model.common.Couleur;

/**
 * Created by Anis on 29/04/2016.
 */
public class PionBlanc extends Pion {

    /**
     *
     * @param couleur_de_piece
     * @param coord
     */
    public PionBlanc(Couleur couleur_de_piece, Coord coord) {
        super(Couleur.BLANC, coord);
    }
}
