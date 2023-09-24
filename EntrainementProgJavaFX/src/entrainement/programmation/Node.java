/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

/**
 *
 * @author katy
 */
public class Node {
    
    int value;
    Node left;
    Node right;
    
    Node(){
    }
    
    Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    
    public Node find(int v){
        
        Node tmp = this;
        
        while(tmp != null){
            
            if(tmp.value == v){
                return tmp;
            }else if(v > tmp.value){
                tmp = tmp.right;
            }else{
                tmp = tmp.left;
            }     
        }   
        return null;
        
    }
    
    public static void main(String[] args){
        
        Node n = 
            new Node(
                10, 
                new Node(
                        8, 
                        new Node(
                                4, 
                                new Node(3, null, null), 
                                new Node(5, null, null)
                        ), 
                        new Node(9, null, null)
                ), 
                new Node(
                        15, 
                        new Node(14, null, null),
                        new Node(
                                21, 
                                new Node(20, null, null), 
                                new Node(43, null, null)
                                )
                        )
                    );
        
        Node myNode = null;
        try
        {
            myNode = n.find(43);
            System.out.println("Node value ->"+myNode.value);
        }
        catch(NullPointerException e)
        {
            System.out.println("No Node found");
        }
        
        
    }
    
}
