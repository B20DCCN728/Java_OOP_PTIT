//Created by Campus
package hoc_phi;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
//
public class Hoc_Phi {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    
}
