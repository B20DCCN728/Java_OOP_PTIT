//Created by Campus
//Bài này làm theo hướng dẫn dưới comment là ok :D
package hoc_phi;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Subject;
import vn.edu.ptit.Student;
//
class PaymentController {
    private Scanner sc = new Scanner(System.in);
    public PaymentController()
    {
      
    }
    public Invoice getInvoice(){
        String code = sc.nextLine();
        String name = sc.nextLine();
        Student student = new Student(code, name);
        
        int totalSubject = Integer.parseInt(sc.nextLine());
        int counter = 0;
        ArrayList<Subject> subject = new ArrayList<>();
        for(int i = 0;i < totalSubject;i++){
            String subjectCode = sc.nextLine();
            String subjectName = sc.nextLine();
            int total = Integer.parseInt(sc.nextLine());
            counter += total;
            subject.add(new Subject(subjectName, subjectCode, total));
        }
        
        String ruleCode = sc.nextLine();
        String ruleName = sc.nextLine();
        double tuition = Double.parseDouble(sc.nextLine());
        Rule rule = new Rule(ruleCode, ruleName, tuition);
        
        Invoice invoice = new Invoice(rule);
        invoice.setSt(student);
        invoice.setAlSubject(subject);
        invoice.setAmount(tuition * counter);
        return invoice;
    }
}
//
public class Hoc_Phi {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    
}
