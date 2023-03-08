/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidangdanruang;

import interfaces.MenghitungRuang;


/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 2*super.luasLingkaran+(r*tinggi);
    }

    @Override
    public double volume() {
        return Lingkaran.PHI*r*r*tinggi;
    }
    
}
