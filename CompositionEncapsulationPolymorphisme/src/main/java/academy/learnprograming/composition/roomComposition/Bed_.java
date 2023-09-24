/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.roomComposition;

/**
 *
 * @author katy
 */
public class Bed_ {
    private Mattress mattress;
    private BedFrame bedFrame;
    private BedBase bedbase;

    public Bed_(Mattress mattress, BedFrame bedFrame, BedBase bedbase) {
        this.mattress = mattress;
        this.bedFrame = bedFrame;
        this.bedbase = bedbase;
    }

    public void listAllElements(){
        System.out.println("  -- Composition of the bed.");
        this.mattress.listInfo();
        getMattress();
        this.bedFrame.listInfo();
        getBedFrame();
        this.bedbase.listInfo();
        getBedbase();
    }
    
    public void make(){
        System.out.println("Bed : making");
    }
    
    private Mattress getMattress() {
        System.out.println("  -- A mattress ");
        return this.mattress;
    }

    private BedFrame getBedFrame() {
        System.out.println("  -- A bed frame ");
        return this.bedFrame;
    }

    private BedBase getBedbase() {
        System.out.println("  -- A bed base ");
        return this.bedbase;
    }
    
    
    
}
