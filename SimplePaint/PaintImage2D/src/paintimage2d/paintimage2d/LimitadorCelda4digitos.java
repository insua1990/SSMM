
package paintimage2d;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitadorCelda4digitos extends PlainDocument{

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
       
        // Sobrecarga del método para limitar la celda a digitos y de longitud max 4
        if(!Character.isDigit(str.charAt(0)))
            return;
        else{
            if(this.getLength()>3) return;
            else super.insertString(offs, str, a); 
        }
        
        
    }
    
    
}
