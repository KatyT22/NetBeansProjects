/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GBlodgett on https://stackoverflow.com/questions/51236554/ascii-art-string-to-character-conversion#51236610
 */
class A{

    static String scanChar(char c)
    {
        //s= s.trim();
        String value=null;
        Map<Character,String> mapping= new HashMap<>();
        mapping.put('A',"\n #  \n# # \n### \n# # \n# # ");
        mapping.put('B',"\n##  \n# # \n##  \n# # \n##  ");
        mapping.put('C',"\n ## \n#   \n#   \n#   \n ## ");
        mapping.put('D',"\n##  \n# # \n# # \n# # \n##  ");
        mapping.put('E',"\n### \n#   \n##  \n#   \n### ");
        mapping.put('F',"\n### \n#   \n##  \n#   \n#   ");
        mapping.put('G',"\n ## \n#   \n# # \n# # \n ## ");
        mapping.put('H',"\n# # \n# # \n### \n# # \n# # ");
        mapping.put('I',"\n### \n #  \n #  \n #  \n### ");
        mapping.put('J',"\n ## \n  # \n  # \n# # \n #  ");
        mapping.put('K',"\n# # \n# # \n##  \n# # \n# # ");
        mapping.put('L',"\n#   \n#   \n#   \n#   \n### ");
        mapping.put('M',"\n# # \n### \n### \n# # \n# # ");
        mapping.put('N',"\n### \n# # \n# # \n# # \n# # ");
        mapping.put('O',"\n #  \n# # \n# # \n# # \n #  ");
        mapping.put('P',"\n##  \n# # \n##  \n#   \n#   ");
        mapping.put('Q',"\n #  \n# # \n# # \n ## \n  # ");
        mapping.put('R',"\n##  \n# # \n##  \n# # \n# # ");
        mapping.put('S',"\n ## \n#   \n #  \n  # \n##  ");
        mapping.put('T',"\n### \n #  \n #  \n #  \n #  ");
        mapping.put('U',"\n# # \n# # \n# # \n# # \n### ");
        mapping.put('V',"\n# # \n# # \n# # \n# # \n #  ");
        mapping.put('W',"\n# # \n# # \n### \n### \n# # ");
        mapping.put('X',"\n# # \n# # \n #  \n# # \n# # ");
        mapping.put('Y',"\n# # \n# # \n #  \n #  \n #  ");
        mapping.put('Z',"\n### \n  # \n #  \n#   \n### ");

        for(Map.Entry entry: mapping.entrySet())
        {
            if(c == (char)entry.getKey())
            {
                return (String)entry.getValue();
            }
        }
        return "?";
    }
}
