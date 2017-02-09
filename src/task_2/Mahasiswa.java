/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/*Azahra Kartika
 * 1301154460
 * IF - 39-12
 * 
 */

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    private char[] nilai;
    private int i;
    
    public Mahasiswa(){
        this.Status = "Tidak Lulus";
        this.i= 0;
        this.nilai = new char[10];
    }
    
    public Mahasiswa(String NIM , String Nama){
                this.NIM = NIM;
                this.Nama = Nama;
                this.Status = "Tidak Lulus";
                this.i = 0;
                this.nilai = new char[10];
            }
    
    public String getNIM(){
        return NIM;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String status){
        this.Status = status;
    }
    
    public char getNilai(int i){
        char nil = this.nilai[i];
        return nil;
    }
    
    public void setNilai(char[] nilai){
        this.nilai = nilai;
    }
    
    public int getI(){
        return i;
    }
    
    public void set(int i){
        this.i = i;
    }
    
    public void addNilai(char nilai){
            if(i<10){
                this.nilai[i] = nilai;
                i++;
    }
}

    public String toString(){
    String mhs = NIM+","+Nama+","+Status+" = ";
    for (int m = 0; m<i; m++){
     mhs = mhs+nilai[m]+",";
}
    return mhs;

}

public char cekNilai(Mahasiswa m){
    char x =0;
    for(char y = 'A'; y <'E'; y++){
        for(int z = 0; z<i; z++){
            if(nilai[z] == y){
                for(int n = 0; n < m.i; n++){
                    if (m.nilai[n] == y){
                        return y;
                    }
                }
            }
        }
    }
    return x;
}
}
    

    

