/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
/**
 *
 * @author ACER
 */

public class UjiKoneksi {
    public static void main(String[] args){
        Connection c = koneksi.sambung_ke_db();
    }
}

