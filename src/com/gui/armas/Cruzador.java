package com.gui.armas;

import javax.swing.*;
import java.awt.*;

public class Cruzador extends Arma
{
    public Cruzador()
    {
        this.tipo = TipoArma.Cruzador ;
        this.width = 120 ;
        this.height = 30 ;
        this.color = new Color(230, 116, 0) ;
        this.matriz = new int[][] {{ TipoArma.Cruzador.ordinal(),
                                     TipoArma.Cruzador.ordinal(),
                                     TipoArma.Cruzador.ordinal(),
                                     TipoArma.Cruzador.ordinal()}} ;

        this.setSize( width, height) ;
        this.setBackground( color ) ;
    }
}
