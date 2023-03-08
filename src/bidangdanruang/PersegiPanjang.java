/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidangdanruang;


import interfaces.MenghitungBidang;

/**
 *
 * @author HP
 */
public class PersegiPanjang implements MenghitungBidang{
    double luasPersegiPanjang, kelilingPersegiPanjang;
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas (){
        luasPersegiPanjang = panjang*lebar;
        return luasPersegiPanjang;
    }

    @Override
    public double keliling() {
        kelilingPersegiPanjang = 2*(panjang+lebar); 
        return kelilingPersegiPanjang;
    }
    
    

    
}
