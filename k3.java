import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicScrollBarUI;

import static javax.swing.JTextField.*;

public class k3 implements ActionListener {
    static int num=4;
    static int z3 = power(num/2),x3 = power(num-(num/2));
    static CB[][] cb;
    static int[][][] f;
    static int[][][] e;
    static int[] in;
    static int[] o;
    static int[] o1;
    static int[][] h2;
    static int[][] d;
    static int[][] h;
    static int[] z1;
    static String[] r2;
    static int[] r2c;
    static int[] r3;
    static int s,s1, v = 0, z = 0, r = 0,bl,bl1;
    JButton submit = new JButton();
    JButton enter = new JButton();
    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    static JPanel grayX = new JPanel();
    static JPanel grayY = new JPanel();
    JLabel[] x = new JLabel[power(4)];
    static JTextField mint = new JTextField();
    static JTextField vart = new JTextField();
    static JTextField dont = new JTextField();
    static JTextArea sol = new JTextArea();
    JRadioButton sop = new JRadioButton("SOP     or");
    JRadioButton pos = new JRadioButton("POS");
    JRadioButton kmap = new JRadioButton("KMAP"/*     or */);
    JRadioButton quine = new JRadioButton("Quine McCluskey method");
    static JButton[][] b = new JButton[4][4];
    JScrollPane sp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JScrollPane soln;
    static boolean bigmap = false;
    static boolean b2 = true;
    boolean bool =true;
    boolean b3 =false;
    static int[][][] ef;
    static int[] bo ;
    static String[] st1;
    static String[] st;
    static int no,bl2=0,bl3=0,c17=0;
    static String[] ColourValues = new String[]{    //Contrast colors for groupings
            "#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#FF00FF", "#00FFFF", "#FFFFFF",
            "#A0A000", "#A000A0", "#00A0A0", "#A0A0A0", "#A00000", "#00A000", "#0000A0",
            "#800000", "#008000", "#000080", "#808000", "#800080", "#008080", "#808080",
            "#C0C000", "#C000C0", "#00C0C0", "#C0C0C0", "#C00000", "#00C000", "#0000C0",
            "#600000", "#006000", "#000060", "#606000", "#600060", "#006060", "#606060",
            "#E00000", "#00E000", "#0000E0", "#E0E000", "#E000E0", "#00E0E0", "#E0E0E0",
            "#400000", "#004000", "#000040", "#404000", "#400040", "#004040", "#404040",
            "#D00000", "#00D000", "#0000D0", "#D0D000", "#D000D0", "#00D0D0", "#D0D0D0",
            "#300000", "#003000", "#000030", "#303000", "#300030", "#003030", "#303030",
    };
    k3() {
        frame.setTitle("Kmap");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(0, 0, 1440, 850);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        l1.setText("Variables");
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.TOP);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Times new Roman", Font.BOLD, 16));
        l1.setBackground(Color.DARK_GRAY);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setBounds(290, 10, 90, 90);
        frame.add(l1);

        l2.setText("Minterms");
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setVerticalTextPosition(JLabel.TOP);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times new Roman", Font.BOLD, 16));
        l2.setBackground(Color.DARK_GRAY);
        l2.setVerticalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setBounds(290, 60, 90, 90);
        frame.add(l2);

        l3.setText("Don't cares");
        l3.setHorizontalTextPosition(JLabel.CENTER);
        l3.setVerticalTextPosition(JLabel.TOP);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Times new Roman", Font.BOLD, 16));
        l3.setBackground(Color.DARK_GRAY);
        l3.setOpaque(true);
        l3.setVerticalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBounds(290, 110, 90, 90);
        frame.add(l3);

        l5.setText("Add Some Variables");
        l5.setHorizontalTextPosition(JLabel.CENTER);
        l5.setVerticalTextPosition(JLabel.TOP);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Times new Roman", Font.BOLD, 30));
        l5.setBackground(Color.DARK_GRAY);
        l5.setOpaque(true);
        l5.setVerticalAlignment(JLabel.CENTER);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setBounds(520,350,400,300);

        vart.setBounds(400, 45, 700, 25);
        vart.setBackground(Color.white);
        vart.setForeground(Color.BLACK);
        vart.setHorizontalAlignment(LEFT);
        vart.setFont(new Font("Times new Roman", Font.BOLD, 16));
        frame.add(vart);

        mint.setBounds(400, 93, 700, 25);
        mint.setBackground(Color.white);
        mint.setForeground(Color.BLACK);
        mint.setHorizontalAlignment(LEFT);
        mint.setFont(new Font("Times new Roman", Font.BOLD, 16));
        frame.add(mint);

        dont.setBounds(400, 142, 700, 25);
        dont.setBackground(Color.white);
        dont.setForeground(Color.BLACK);
        dont.setHorizontalAlignment(LEFT);
        dont.setFont(new Font("Times new Roman", Font.BOLD, 16));
        frame.add(dont);

        sop.setBounds(430, 180, 85, 45);
        sop.addActionListener(this);
        sop.setFocusable(false);
        sop.setBackground(Color.darkGray);
        sop.setForeground(Color.cyan);
        sop.setSelected(true);
        frame.add(sop);

        pos.setBounds(520, 180, 75, 45);
        pos.addActionListener(this);
        pos.setFocusable(false);
        pos.setForeground(Color.cyan);
        pos.setBackground(Color.darkGray);
        frame.add(pos);

        kmap.setBounds(800, 180, 100, 45);
        kmap.addActionListener(this);
        kmap.setFocusable(false);
        kmap.setForeground(Color.cyan);
        kmap.setBackground(Color.darkGray);
        kmap.setSelected(true);
        frame.add(kmap);

        quine.setBounds(900, 180, 200, 45);
        quine.addActionListener(this);
        quine.setFocusable(false);
        quine.setForeground(Color.cyan);
        quine.setBackground(Color.darkGray);
        frame.add(quine);

        /*submit.setBackground(new Color(150, 250, 0));
        submit.setForeground(Color.black);
        submit.setBounds(600, 245, 80, 20);
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setEnabled(true);
        submit.addActionListener(this);
        frame.add(submit);*/

        enter.setBackground(Color.cyan);
        enter.setForeground(Color.black);
        enter.setFocusable(false);
        enter.setEnabled(true);
        enter.setBounds(680, 245, 80, 20);
        enter.setText("Refresh");
        enter.addActionListener(this);
        frame.add(enter);

        grayX.setBounds(850, 385, 75 * 5, 75);
        grayX.setLayout(new GridLayout(1, 0));
        grayX.setBackground(new Color(100, 220, 255));
        l4.setForeground(Color.BLACK);
        l4.setText("abcd");
        l4.setSize(75, 75);
        l4.setHorizontalAlignment(CENTER);
        grayX.add(l4);
        grayY.setBounds(850, 460, 75, 75 * 4);
        grayY.setLayout(new GridLayout(0, 1));
        grayY.setBackground(new Color(100, 220, 255));
        for (int i = 0; i < 4; i++) {
            x[i] = new JLabel();
            x[i].setForeground(Color.BLACK);
            x[i].setText(gray(2,i));
            x[i].setHorizontalAlignment(CENTER);
            x[i].setPreferredSize(new Dimension(75, 75));
            grayX.add(x[i]);
            x[i] = new JLabel();
            x[i].setForeground(Color.BLACK);
            x[i].setText(gray(2,i));
            x[i].setHorizontalAlignment(CENTER);
            x[i].setPreferredSize(new Dimension(75, 75));
            grayY.add(x[i]);
        }
        frame.add(grayX);
        frame.add(grayY);
        panel.setBounds(925, 460, 75 * 4, 75 * 4);
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = new JButton();
                if ((i + j) % 2 == 0) {
                    b[i][j].setBackground(new Color(55, 55, 55));
                } else {
                    b[i][j].setBackground(new Color(75, 75, 75));
                }
                panel.add(b[i][j]);
                b[i][j].setForeground(Color.white);
                b[i][j].setFocusable(false);
                b[i][j].setFont(new Font("Times new roman", Font.BOLD, 15));
                b[i][j].setText("0");
                b[i][j].setBorder(null);
                b[i][j].setPreferredSize(new Dimension(75, 75));
                b[i][j].addActionListener(this);
            }
        }
        frame.add(panel);
        sol.setBackground(new Color(200, 250, 255));
        sol.setForeground(Color.black);
        sol.setFont(new Font("Times new Roman", Font.BOLD, 20));
        sol.setText("\n"+"     Solution:"+"\n             0");
        sol.setLineWrap(true);
        sol.setEditable(false);
        soln = new JScrollPane(sol);
        soln.setBounds(120, 430, 500, 300);
        soln.setVerticalScrollBarPolicy(20);
        frame.add(soln);
        vart.setText("a,b,c,d");
        st = new String[]{"a", "b", "c", "d"};
        r2 = new String[]{"a","b","c","d"};
        r2c = new int[]{1,1,1,1};
        no=4;
        vart.getDocument().addDocumentListener(dv);
        mint.getDocument().addDocumentListener(mt);
        dont.getDocument().addDocumentListener(dt);
    }

    public static void main(String[] args) {
        new k3();
    }

    public static int power(int n) {
        int i, a = 1;
        for (i = 0; i < n; i++) {
            a = a * 2;
        }
        return a;
    }
    public String gray(int n, int z){
        int i=n-1,k;
        String b;
        StringBuilder s =new StringBuilder();
        int[] a = new int[num+1];
        int[] b2 = new int[num+1];
        if(z!=0) {
            for (k = z; k > 1; k = k / 2) {
                a[i] = k % 2;
                i = i - 1;
            }
            a[i] = k;
        }
        else {
            for (i=0;i<n;i++){
                a[i] = 0;
            }
        }
        b2[0]=a[0];
        for(i=1;i<n;i++){
            if(a[i-1]==a[i]){
                b2[i]=0;
            }
            else if(a[i-1]!=a[i]){
                b2[i]=1;
            }
        }
        for(i=0;i<n;i++){
            s.append(b2[i]);
        }
        b = String.valueOf(s);
        return b;
    }
    public String gtb1(int m,int o,int n){
        int k = n/2, l =n-k,i,j=1,p=0;
        int[] a =new int[num+1];
        StringBuilder s =new StringBuilder();
        String st1,st2,st,st3;
        st1 = gtb(m,k);
        st2 = gtb(o,l);
        s.append(st1).append(st2);
        st = s.toString();
        String[] s1 = st.split("");
        for(i=0;i<s1.length;i++){
            a[i]= Integer.parseInt(s1[i]);
        }
        for (i = s1.length-1; i>=0; i--) {
            p = p + (a[i] * j);
            j = j * 2;
        }
        st3 = Integer.toString(p);
        return(st3);
    }
    public String gtb(int m,int n){
        int i = n-1,k;
        StringBuilder sb = new StringBuilder();
        String s;
        int[] a = new int[num+1];
        int[] b = new int[num+1];
        if(m!=0) {
            for (k = m; k > 1; k = k / 2) {
                a[i] = k % 2;
                i = i - 1;
            }
            a[i] = k;
        }
        else {
            for (i=0;i<n;i++){
                a[i] = 0;
            }
        }
        b[0]=a[0];
        for(i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                b[i+1]=0;
            }
            else if(a[i]!=a[i+1]){
                b[i+1]=1;
            }
        }
        for(i=0;i<n;i++){
            sb.append(b[i]);
        }
        s = sb.toString();
        return(s);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int i, j, l = num / 2, m = num - l, n = power(l), k = power(m);
        String t, t1;
        if (e.getSource() == enter) {
            if(b2) {
                for (i = 0; i < n; i++) {
                    for (j = 0; j < k; j++) {
                        b[i][j].setText("0");
                    }
                }
            }
            if(!b2) {
                for (i = 0; i < n; i++) {
                    for (j = 0; j < k; j++) {
                        b[i][j].setText("1");
                    }
                }
            }
            mint.setText("");
            dont.setText("");
            update();
            sol.setText("\n" + "     Solution:"+"\n             0");
        }
        if (e.getSource() == pos) {
            pos.setSelected(true);
            sop.setSelected(false);
            bool = false;
            for (i = 0; i < n; i++) {
                for (j = 0; j < k; j++) {
                    b[i][j].setText("1");
                }
            }
            b2 = false;
            update();
        }
        if (e.getSource() == sop) {
            pos.setSelected(false);
            sop.setSelected(true);
            bool = false;
            for (i = 0; i < n; i++) {
                for (j = 0; j < k; j++) {
                    b[i][j].setText("0");
                }
            }
            b2 = true;
            update();
        }
        if (b2) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < k; j++) {
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("0")) {
                        t = gtb1(i, j, num);
                        t1 = mint.getText();
                        mint.getDocument().removeDocumentListener(mt);
                        mint.setText(st(t, t1));
                        mint.getDocument().addDocumentListener(mt);
                        update();
                        break;
                    }
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("1")) {
                        t = gtb1(i, j, num);
                        t1 = dont.getText();
                        dont.getDocument().removeDocumentListener(dt);
                        dont.setText(st(t, t1));
                        dont.getDocument().addDocumentListener(dt);
                        t1 = mint.getText();
                        t = gtb1(i, j, num);
                        mint.getDocument().removeDocumentListener(mt);
                        mint.setText(st1(t, t1));
                        mint.getDocument().addDocumentListener(mt);
                        update();
                        break;
                    }
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("x")) {
                        t1 = dont.getText();
                        t = gtb1(i, j, num);
                        dont.getDocument().removeDocumentListener(dt);
                        dont.setText(st1(t, t1));
                        dont.getDocument().addDocumentListener(dt);
                        update();
                        break;
                    }
                }
            }
        }
        if (!b2) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < k; j++) {
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("0")) {
                        t = gtb1(i, j, num);
                        t1 = dont.getText();
                        dont.getDocument().removeDocumentListener(dt);
                        dont.setText(st(t, t1));
                        dont.getDocument().addDocumentListener(dt);
                        t1 = mint.getText();
                        t = gtb1(i, j, num);
                        mint.getDocument().removeDocumentListener(mt);
                        mint.setText(st1(t, t1));
                        mint.getDocument().addDocumentListener(mt);
                        update();
                        break;
                    }
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("1")) {
                        t = gtb1(i, j, num);
                        t1 = mint.getText();
                        mint.getDocument().removeDocumentListener(mt);
                        mint.setText(st(t, t1));
                        mint.getDocument().addDocumentListener(mt);
                        update();
                        break;
                    }
                    if (e.getSource() == b[i][j] && b[i][j].getText().equals("x")) {
                        t1 = dont.getText();
                        t = gtb1(i, j, num);
                        dont.getDocument().removeDocumentListener(dt);
                        dont.setText(st1(t, t1));
                        dont.getDocument().addDocumentListener(dt);
                        update();
                        break;
                    }
                }
            }
        }
    }
    public String st1(String t ,String t1){
        String t3;
        StringBuilder sf = new StringBuilder();
        String[] t2 = t1.split(",");
        t3 = sf.toString();
        for (String item : t2) {
            if (!item.equals(t)) {
                if (t3.equals("")) {sf.append(item);
                } else {sf.append(",").append(item);
                }
                t3 = sf.toString();
            }
        }
        return(t3);
    }
    public String st(String t, String t1){
        StringBuilder sf = new StringBuilder();
        String[] t2 = t1.split("");
        if(!t2[t2.length-1].equals(",")&&!t2[t2.length-1].equals("")){sf.append(t1).append(",").append(t);}
        if(t2[t2.length-1].equals(",")||t2[t2.length-1].equals("")){sf.append(t1).append(t);}
        t1 = sf.toString();
        return(t1);
    }
    public void varupdate(){
        int i, j, n, c=0;
        boolean f2;
        String v;
        n=0;
        v = vart.getText();
        String[] st2 = v.split(",");
        st1 = new String[st2.length+1];
        st = new String[40];
        for (i = 0; i < st2.length; i++) {
            if (!st2[i].equals("")&&!st2[i].equals(" ")) {
                f2 = true;
                for (j = 0; j < n; j++) {
                    if (st2[i].equals(st1[j])) {
                        f2 = false;
                    }
                }
                if (f2) {
                    st1[n] = st2[i];
                    n++;
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<no;j++){
                if(st1[i].equals(st[j])){
                    c++;
                    break;
                }
            }
        }
        if(c!=no || c!=n){
            setup(n);
        }
        no=0;
        for(i=0;i<n;i++){
            st[no]=st1[i];
            no++;
        }
    }
    public void setup(int n){
        int n1=0,k=n/2,l=n-k,m,o,xgx=850,ygx=385,bs=75,xgy=850,ygy=460,xp=925,yp=460;
        m = power(l);
        o = power(k);
        boolean f2;
        String s;
        String r1 = vart.getText();
        String[] r = r1.split(",");
        r2 =new String[r.length+1];
        r2c = new int[r.length+1];
        StringBuilder s1 = new StringBuilder();
        for (String value : r) {
            if (!value.equals("")&&!value.equals(" ")) {
                f2 = true;
                for (int j = 0; j < n1; j++) {
                    if (value.equals(r2[j])) {
                        f2 = false;
                        break;
                    }
                }
                if (f2) {
                    r2[n1] = value;
                    n1++;
                }
            }
        }
        for(int i=0;i<n1;i++){
            String[] r3=r2[i].split("");
            r2c[i] = r3.length;
            if(r3.length>1){
                s1.append("(").append(r2[i]).append(")");
            }
            else{
                s1.append(r2[i]);
            }
        }
        s = String.valueOf(s1);
        System.out.println("YES"+n);
        frame.remove(sp);
        frame.remove(panel);
        frame.remove(grayX);
        frame.remove(grayY);
        if(n!=0){frame.remove(l5);}
        if(n==1 || n==2){
            xgx+=120;
            xgy+=120;
            xp+=120;
            ygx+=80;
            ygy+=80;
            yp+=80;
            if(n==1){ygx+=20;ygy+=20;yp+=20;}
        }
        if(n==3){
            ygx+=80;
            ygy+=80;
            yp+=80;
        }
        if(n==5){
            xgx-=130;
            xgy-=130;
            xp-=130;
        }
        if(n==6){
            bs=55;
            ygx-=50;
            ygy-=70;
            yp-=70;
            xp-=20;
        }
        if(n==7){
            frame.remove(soln);
            soln.setBounds(60,390,450,400);
            frame.add(soln);
            bs =50;
            ygx-=25;
            xgx-=280;
            xgy-=280;
            xp-=305;
            yp-=50;
            ygy-=50;
        }
        if(n>7){
            bs=50;
        }
        num=n;
        if(num>10){bigmap = true;}
        if(num<=10){bigmap = false;}
        z3 = power(num/2);
        x3 = power(num-(num/2));
        grayX = new JPanel();
        grayY = new JPanel();
        grayX.setLayout(new GridLayout(1, 0));
        grayX.setBackground(new Color(100, 220, 255));
        l4.setForeground(Color.BLACK);
        l4.setText(s);
        l4.setSize(bs, bs);
        l4.setHorizontalAlignment(CENTER);
        if(n<=7){
        grayX.add(l4);}
        grayY.setLayout(new GridLayout(0, 1));
        grayY.setBackground(new Color(100, 220, 255));
        x = new JLabel[power(num)];
        for (int i = 0; i < m; i++) {
            x[i] = new JLabel();
            x[i].setForeground(Color.BLACK);
            x[i].setText(gray(l, i));
            x[i].setToolTipText(gray(l,i));
            x[i].setHorizontalAlignment(CENTER);
            x[i].setPreferredSize(new Dimension(bs, bs));
            grayX.add(x[i]);
        }
        for(int i=0;i<o;i++){
            x[i] = new JLabel();
            x[i].setForeground(Color.BLACK);
            x[i].setText(gray(k,i));
            x[i].setToolTipText(gray(k,i));
            x[i].setHorizontalAlignment(CENTER);
            x[i].setPreferredSize(new Dimension(bs, bs));
            grayY.add(x[i]);
        }
        panel = new JPanel();
        panel.setLayout(new GridLayout(o, m));
        b = new JButton[o][m];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = new JButton();
                if ((i + j) % 2 == 0) {
                    b[i][j].setBackground(new Color(55, 55, 55));
                } else {
                    b[i][j].setBackground(new Color(75, 75, 75));
                }
                panel.add(b[i][j]);
                b[i][j].setForeground(Color.white);
                b[i][j].setFocusable(false);
                b[i][j].setFont(new Font("Times new roman", Font.BOLD, 15));
                b[i][j].setBorder(null);
                if(b2){b[i][j].setText("0");}
                if(!b2){b[i][j].setText("1");}
                b[i][j].setPreferredSize(new Dimension(bs, bs));
                b[i][j].addActionListener(this);
            }
        }
        if(n<=7){
            grayX.setBounds(xgx, ygx, bs * (m+1), bs);
            grayY.setBounds(xgy, ygy, bs, bs * o);
            panel.setBounds(xp, yp, bs * m, bs * o);
            frame.add(grayX);
            frame.add(grayY);
            frame.add(panel);
        }
        if(n<7){frame.remove(soln);
            soln.setBounds(120, 430, 500, 300);
            frame.add(soln);}
        if(n>7){
            frame.remove(soln);
            soln.setBounds(120, 385, 600, 400);
            frame.add(soln);
            sp = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            sp.setColumnHeaderView(grayX);
            sp.setRowHeaderView(grayY);
            sp.getHorizontalScrollBar().setUI(new CustomScrollBarUI());
            sp.getVerticalScrollBar().setUI(new CustomScrollBarUI());
            sp.setBorder(null);
            sp.setBackground(new Color(100, 220, 255));
            sp.setBounds(820,315,530,530);
            frame.add(sp);
        }
        if(n==0){
            frame.remove(grayX);
            frame.remove(grayY);
            frame.remove(panel);
            frame.remove(soln);
            frame.add(l5);
        }
        bool = false;
        update();
        frame.revalidate();
        frame.repaint();
        b3=true;
    }
    public void minup1(int n, int x){
        int i = n - 1, k, j = n / 2, p = 1, q = 1, m = 0, o = 0;
        int[] a = new int[num+1];
        if (x != 0) {
            for (k = x; k > 1; k = k / 2) {
                a[i] = k % 2;
                i = i - 1;
            }
            a[i] = k;
        }
        else {
            a[0] = 0;
        }
        for (i = 1; i < n; i++) {
            if (i != j) {
                if (a[i] == a[i - 1]) {
                    a[i] = 0;
                }
                else if (a[i] != a[i - 1]) {
                    a[i] = 1;
                }
            }
        }
        for (i = j - 1; i >= 0; i--) {
            m = m + (a[i] * p);
            p = p * 2;
        }
        for (i = n - 1; i >= j; i--) {
            o = o + (a[i] * q);
            q = q * 2;
        }
        d[r][0]=m;
        d[r][1]=o;
        r++;
    }
    public void update() {
       //try {
            sol.setText("\n" + "     Solution:");
            int i, j, k, n = num, c, c1 = 0, l, n2 = 0, n3 = 0;
            s=0;v=0;z=0;bl = 0;bl1 = 0;
            boolean f1;
            String si = mint.getText();
            String di = dont.getText();
            String[] bi = si.split(",");
            String[] b1 = di.split(",");
            z1 = new int[bi.length+b1.length+1];
            for (i = 0; i < bi.length; i++) {
                if (!bi[i].equals("") && !bi[i].equals(" ")) {
                    c = Integer.parseInt(bi[i]);
                    f1 = true;
                    if (c < power(num)) {
                        for (j = 0; j < c1; j++) {
                            if (c == z1[j]) {
                                f1 = false;
                                break;
                            }
                        }
                        if (f1) {
                            z1[c1] = c;
                            c1++;
                        }
                    }
                }
            }
            bl = c1;
            for (i = 0; i < b1.length; i++) {
                if (!b1[i].equals("") && !b1[i].equals(" ")) {
                    c = Integer.parseInt(b1[i]);
                    f1 = true;
                    if (c < power(num)) {
                        for (j = 0; j < c1; j++) {
                            if (c == z1[j]) {
                                f1 = false;
                                break;
                            }
                        }
                        if (f1) {
                            z1[c1] = c;
                            c1++;
                        }
                    }
                }
            }
            bl1 = c1;
            h2 = new int[power(num)][bl1+1];
            h = new int[power(num)][bl1+num+1];
            o1 = new int[bl+1];
            o = new int[bl1+num+1];
            in =new int[num+1];
            f = new int[num+1][bl1*2][num+bl1+1];
            e = new int[num+1][bl1*2][num+bl1+1];
            for (i = 0; i < bl; i++) {
                for (j = 0; j < bl3; j++) {
                    if (z1[i] == r3[j]) {
                        n3++;
                        break;
                    }
                }
            }
            for (i = bl; i < bl1; i++) {
                for (j = bl3; j < bl2; j++) {
                    if (z1[i] == r3[j]) {
                        n2++;
                        break;
                    }
                }
            }
            if (n2 != bl2 || n2 != bl1 || n3 != bl3 || n3 != bl || !bool) {
                for (i = 0; i < r; i++) {
                    if (b2 && d[i][0]<z3 && d[i][1]<x3) {
                        b[d[i][0]][d[i][1]].setText("0");
                    }
                    if (!b2 && d[i][0]<z3 && d[i][1]<x3) {
                        b[d[i][0]][d[i][1]].setText("1");
                    }
                }
                d = new int[bl1][2];
                r = 0;
                for (i = 0; i < bl1; i++) {
                    minup1(num, z1[i]);
                }
                for (i = 0; i < bl; i++) {
                    if (b2) {
                        b[d[i][0]][d[i][1]].setText("1");
                    }
                    if (!b2) {
                        b[d[i][0]][d[i][1]].setText("0");
                    }
                }
                for (i = bl; i < bl1; i++) {
                    b[d[i][0]][d[i][1]].setText("x");
                }
                bool = true;
            for (i = 0; i < bl1; i++) {
                dtb1(z1[i], n);
            }

            for (i = 0; i < s; i++) {
                for (j = 0; j < in[i]; j++) {
                    for (k = 0; k <= n; k++) {
                        System.out.print(f[i][j][k]);
                        if (k == n - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
            main1(n);
            if (s == 1) {
                for (j = 0; j < in[s - 1]; j++) {
                    for (l = 0; l < n + z; l++) {
                        h[v][l] = f[s - 1][j][l];
                    }
                    o[v] = n + z;
                    v++;
                }
            }
            System.out.println("Prime implicants :");
            for (i = 0; i < v; i++) {
                for (j = 0; j < o[i]; j++) {
                    System.out.print(h[i][j]);
                    if (j == n - 1) {
                        System.out.print(" ");
                    }
                    if (j > n - 1 && j < o[i] - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
            ess(n);
            }
            r3 = new int[bl1+1];
            bl2 = 0;
            bl3 = 0;
            for (i = 0; i < bl; i++) {
                r3[bl3] = z1[i];
                bl3++;
            }
            for (i = bl; i < bl1; i++) {
                r3[bl2] = z1[i];
                bl2++;
            }
      // }
       /*catch(Exception e) {
           sol.setText("\n\n\n\n\t\t\t\t        Enter Valid terms");
       }*/
    }
    static class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Color color;
            if (isDragging) {
                color = new Color(75,75,75);
            } else if (isThumbRollover()) {
                color = new Color(75,75,75);
            } else {
                color = Color.DARK_GRAY;
            }
            g2.setPaint(color);
            g2.fillRoundRect(r.x+3, r.y+3, r.width-6, r.height-6, 20, 25);
            g2.dispose();
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            g.setColor(new Color(100, 220, 255));
            g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
        }

        @Override
        protected void setThumbBounds(int x, int y, int width, int height) {
            super.setThumbBounds(x, y, width, height);
            scrollbar.repaint();
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(0, 0);
                }
            };
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(0, 0);
                }
            };
        }
    }
    final DocumentListener dv = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            varupdate();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            varupdate();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            varupdate();
        }
    };

    final DocumentListener mt = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            update();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            update();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            update();
        }
    };

    final DocumentListener dt = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            update();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            update();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {update();}
    };

    static class CustomBorder extends AbstractBorder {

        private final Color[] color;
        private final boolean[] b;

        public CustomBorder(Color[] color, boolean[] b) {
            this.color = color;
            this.b = b;
        }

        // This is a function of AbstractBorder class.
        // This is called whenever the CustomBorder constructor is called.
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            if (b[0]) {
                g.setColor(color[0]);
                g.fillRect(x, y, width, 2);      // here 2 is the thickness of the border
            }
            if (b[1]) {
                g.setColor(color[1]);
                g.fillRect(x, y + height - 2, width, 2);
            }
            if (b[2]) {
                g.setColor(color[2]);
                g.fillRect(x, y, 2, height);
            }
            if (b[3]) {
                g.setColor(color[3]);
                g.fillRect(x + width - 2, y, 2, height);
            }
        }
    }

    public static void main1(int n) {
        int i, j, l, m, k, p, q, u = 0, t = 0, u1, t1, p1, q1, v1 = 1, y = 0, y1, z1,x,x1,x2=1;
        int[] g = new int[num+1];
        s1=s;
        while (v1 != 0) {
            v1 = 0;
            z = power(y);
            for (i = 0; i < s - 1; i++) {
                p = 0;
                for (j = 0; j < in[i]; j++) {
                    p1 = 0;
                    for (k = 0; k < in[i + 1]; k++) {
                        q = 0;
                        for (l = 0; l < n; l++) {
                            if (f[i][j][l] != f[i + 1][k][l]) {
                                q++;
                                t = l;
                            }
                        }
                        if (q == 1) {
                            t1 = 0;
                            v1++;
                            q1 = f[i][j][t];
                            f[i][j][t] = -1;
                            for (m = 0; m < g[u]; m++) {
                                u1 = 0;
                                for (l = 0; l < n; l++) {
                                    if (f[i][j][l] == e[u][m][l]) {
                                        u1++;
                                    }
                                }
                                if (u1 == n) {
                                    t1++;
                                }
                            }
                            p1++;
                            f[i][j][t] = q1;
                            if (t1 == 0) {
                                for (l = 0; l < n + z; l++) {
                                    e[u][p][l] = f[i][j][l];
                                }
                                e[u][p][t] = -1;
                                for (l = n; l < n + z; l++) {
                                    e[u][p][l + z] = f[i + 1][k][l];
                                }
                                p++;
                                g[u] = p;
                            }
                        }
                    }
                    if (p1 == 0) {
                        if (u > 0) {
                            z1 = 0;
                            for (k = 0; k < g[u - 1]; k++) {
                                y1 = 0;
                                for (l = n; l < n + z; l++) {
                                    for (m = n; m < n + (2 * z); m++) {
                                        if (f[i][j][l] == e[u - 1][k][m]) {
                                            y1++;
                                        }
                                    }
                                }
                                if (y1 == z) {
                                    z1++;
                                }
                            }
                            if (z1 == 0) {
                                for (l = 0; l < n + z; l++) {
                                    h[v][l] = f[i][j][l];
                                }
                                o[v] = n+z;
                                v++;
                            }
                        }
                        if (u == 0) {
                            for (l = 0; l < n + z; l++) {
                                h[v][l] = f[i][j][l];
                            }
                            o[v] = n+z;
                            v++;
                        }
                    }
                }
                u++;
            }
            if(u>0) {
                for (j = 0; j < in[s - 1]; j++) {
                    x = 0;
                    for (k = 0; k < g[u - 1]; k++) {
                        x1 = 0;
                        for (l = n; l < n + z; l++) {
                            for (m = n; m < n + (2 * z); m++) {
                                if (f[s - 1][j][l] == e[u - 1][k][m]) {
                                    x1++;
                                }
                            }
                        }
                        if (x1 == z) {
                            x++;
                        }
                    }
                    if (x == 0) {
                        for (l = 0; l < n + z; l++) {
                            h[v][l] = f[s - 1][j][l];
                        }
                        o[v] = n + z;
                        v++;
                    }
                }
            }
            if (v1 != 0) {
                for (i = 0; i < s; i++) {
                    for (j = 0; j < in[i]; j++) {
                        for (l = 0; l < n + z; l++) {
                            f[i][j][l] = 0;
                        }
                    }
                }
                s = u;
                u = 0;
                for (i = 0; i < s; i++) {
                    in[i] = g[i];
                    g[i] = 0;
                }
                System.out.println("Grouping "+ x2);
                x2++;
                for (i = 0; i < s; i++) {
                    for (j = 0; j < in[i]; j++) {
                        for (l = 0; l < n + (2 * z); l++) {
                            f[i][j][l] = e[i][j][l];
                            System.out.print(e[i][j][l]);
                            if(l==n-1){
                                System.out.print(" ");
                            }
                            if(l>n-1 && l<(n+(2*z))-1){
                                System.out.print(",");
                            }
                            e[i][j][l] = 0;
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                y++;
            }
        }
    }
    public static void ess(int n){
        int i,j,k,l=0,c1=0,c2=0,e=0,f4=0,o2,c6=1,c10,c11,i1,e2=0,d1=c1-1,d2=0,d3,c7,c8,c9,c15,c16,c18;
        int[] p = new int[bl1+1];
        int[] q = new int[bl1+1];
        int[] q2 = new int[bl1+1];
        int[][] bor = new int[power(num)][bl1+1];
        boolean f1,f2,f3;

        for(i=0;i<v;i++){
            for(j=n;j<o[i];j++){
                f1=true;
                for(k=0;k<l;k++) {
                    if (h[i][j] == o1[k]) {
                        f1=false;
                    }
                }
                for(k=bl;k<bl1;k++){
                    if(h[i][j] == z1[k]){
                        f1=false;
                    }
                }
                if(f1){
                    o1[l] = h[i][j];
                    l++;
                }
                for(k=0;k<l;k++) {
                    if (h[i][j] == o1[k]) {
                        h2[i][k]=1;
                    }
                }
            }
        }
        for(i=0;i<l;i++){
            System.out.println(o1[i]);
        }
        for(i=0;i<v;i++) {
            for(j=0;j<l;j++){
                System.out.print(h2[i][j]);
            }
            System.out.println();
        }
        while(c6!=0) {
            System.out.println("Column dominance with single x");
            c6 = 0;
            if (e == l) {
                for (j = 0; j < v; j++) {
                    f1 = true;
                    for (k = 0; k < f4; k++) {
                        if (j == p[k]) {
                            f1 = false;
                        }
                    }
                    if (f1) {
                        p[f4] = j;
                        f4++;
                        q2[e2] = j;
                        e2++;
                    }
                }
            }
            for (i = 0; i < l; i++) {
                c1 = 0;
                f1 = true;
                for (j = 0; j < e; j++) {
                    if (i == q[j]) {
                        f1 = false;
                    }
                }
                if (f1) {
                    for (j = 0; j < v; j++) {
                        f2 = true;
                        for (k = 0; k < f4; k++) {
                            if (j == p[k]) {
                                f2 = false;
                            }
                        }
                        if (h2[j][i] == 1 && f2) {
                            c1++;
                            c2 = j;
                        }
                    }
                    if (c1 == 1) {
                        c6++;
                        p[f4] = c2;
                        f4++;
                        for (k = 0; k < l; k++) {
                            f3 = true;
                            if (h2[c2][k] == 1) {
                                for (j = 0; j < e; j++) {
                                    if (k == q[j]) {
                                        f3 = false;
                                    }
                                }
                                if (f3) {
                                    q[e] = k;
                                    e++;
                                }
                            }
                        }
                    }
                }
            }
            for (i = 0; i < f4; i++) {
                System.out.println(p[i]);
            }
            for (i = 0; i < e; i++) {
                System.out.println("*" + q[i]);
            }
            d3 = 0;
            for (i = 0; i < v; i++) {
                f1 = true;
                for (o2 = 0; o2 < f4; o2++) {
                    if (i == p[o2]) {
                        f1 = false;
                    }
                    if (!f1) {
                        break;
                    }
                }
                if (f1) {
                    d3++;
                    if (d3 == 1) {
                        for (j = 0; j < l; j++) {
                            f2 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f2 = false;
                                }
                                if (!f2) {
                                    break;
                                }
                            }
                            if (f2) {
                                System.out.print(o1[j]);
                                if (j != l - 1) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    for (j = 0; j < l; j++) {
                        f3 = true;
                        for (k = 0; k < e; k++) {
                            if (j == q[k]) {
                                f3 = false;
                            }
                        }
                        if (f3) {
                            System.out.print(h2[i][j]);
                        }
                    }
                    for (j = n; j < o[i]; j++) {
                        if (j == n) {
                            System.out.print(" ");
                        }
                        System.out.print(h[i][j]);
                        if (j < o[i] - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println("column dominance");
            for (i = 0; i < l; i++) {
                f1 = true;
                for (j = 0; j < e; j++) {
                    if (i == q[j]) {
                        f1 = false;
                    }
                }
                for (i1 = 0; i1 < l; i1++) {
                    f2 = true;
                    c10 = 0;
                    c11 = 0;
                    for (j = 0; j < e; j++) {
                        if (i1 == q[j]) {
                            f2 = false;
                        }
                    }
                    if (f1 && f2 && i != i1) {
                        for (j = 0; j < v; j++) {
                            f3 = true;
                            for (k = 0; k < f4; k++) {
                                if (j == p[k]) {
                                    f3 = false;
                                }
                            }
                            if (f3) {
                                if (h2[j][i] == 1) {
                                    c10++;
                                    if (h2[j][i] == h2[j][i1]) {
                                        c11++;
                                    }
                                }
                            }
                        }
                        if (c10 == c11 && c10 != 0) {
                            c6++;
                            q[e] = i1;
                            e++;
                        }
                    }
                }
            }
            for (i = 0; i < f4; i++) {
                System.out.println(p[i]);
            }
            for (i = 0; i < e; i++) {
                System.out.println("*" + q[i]);
            }
            d3 = 0;
            for (i = 0; i < v; i++) {
                f1 = true;
                for (o2 = 0; o2 < f4; o2++) {
                    if (i == p[o2]) {
                        f1 = false;
                    }
                    if (!f1) {
                        break;
                    }
                }
                if (f1) {
                    d3++;
                    if (d3 == 1) {
                        for (j = 0; j < l; j++) {
                            f2 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f2 = false;
                                }
                                if (!f2) {
                                    break;
                                }
                            }
                            if (f2) {
                                System.out.print(o1[j]);
                                if (j != l - 1) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    for (j = 0; j < l; j++) {
                        f3 = true;
                        for (k = 0; k < e; k++) {
                            if (j == q[k]) {
                                f3 = false;
                            }
                        }
                        if (f3) {
                            System.out.print(h2[i][j]);
                        }
                    }
                    for (j = n; j < o[i]; j++) {
                        if (j == n) {
                            System.out.print(" ");
                        }
                        System.out.print(h[i][j]);
                        if (j < o[i] - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println("Row dominance");
            for (i = 0; i < v; i++) {
                f1 = true;
                for (j = 0; j < f4; j++) {
                    if (i == p[j]) {
                        f1 = false;
                    }
                }
                for (i1 = 0; i1 < v; i1++) {
                    f2 = true;
                    c10 = 0;
                    c11 = 0;
                    for (j = 0; j < f4; j++) {
                        if (i1 == p[j]) {
                            f2 = false;
                        }
                    }
                    if (f1 && f2 && i != i1) {
                        for (j = 0; j < l; j++) {
                            f3 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f3 = false;
                                }
                            }
                            if (f3) {
                                if (h2[i][j] == 1) {
                                    c10++;
                                    if (h2[i][j] == h2[i1][j]) {
                                        c11++;
                                    }
                                }
                            }
                        }
                        if (c10 == c11 && c10 != 0) {
                            c6++;
                            p[f4] = i;
                            q2[e2] = i;
                            e2++;
                            f4++;
                        }
                    }
                }
            }
            for (i = 0; i < f4; i++) {
                System.out.println(p[i]);
            }
            for (i = 0; i < e; i++) {
                System.out.println("*" + q[i]);
            }
            d3 = 0;
            for (i = 0; i < v; i++) {
                f1 = true;
                for (o2 = 0; o2 < f4; o2++) {
                    if (i == p[o2]) {
                        f1 = false;
                    }
                    if (!f1) {
                        break;
                    }
                }
                if (f1) {
                    d3++;
                    if (d3 == 1) {
                        for (j = 0; j < l; j++) {
                            f2 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f2 = false;
                                }
                                if (!f2) {
                                    break;
                                }
                            }
                            if (f2) {
                                System.out.print(o1[j]);
                                if (j != l - 1) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    for (j = 0; j < l; j++) {
                        f3 = true;
                        for (k = 0; k < e; k++) {
                            if (j == q[k]) {
                                f3 = false;
                            }
                        }
                        if (f3) {
                            System.out.print(h2[i][j]);
                        }
                    }
                    for (j = n; j < o[i]; j++) {
                        if (j == n) {
                            System.out.print(" ");
                        }
                        System.out.print(h[i][j]);
                        if (j < o[i] - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                }
            }
            if (f4 < v && c6 == 0) {
                System.out.println("column dominance with maximum x");
                for (i = 0; i < v; i++) {
                    c1 = 0;
                    f1 = true;
                    for (j = 0; j < f4; j++) {
                        if (i == p[j]) {
                            f1 = false;
                        }
                    }
                    if (f1) {
                        for (j = 0; j < l; j++) {
                            f2 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f2 = false;
                                }
                            }
                            if (h2[i][j] == 1 && f2) {
                                c1++;
                            }
                        }
                        if (c1 > d1) {
                            d1 = c1;
                            d2 = i;
                        }
                    }
                }
                c6++;
                p[f4] = d2;
                f4++;
                for (k = 0; k < l; k++) {
                    f3 = true;
                    if (h2[d2][k] == 1) {
                        for (j = 0; j < e; j++) {
                            if (k == q[j]) {
                                f3 = false;
                            }
                        }
                        if (f3) {
                            q[e] = k;
                            e++;
                        }
                    }
                }
            }
            for (i = 0; i < f4; i++) {
                System.out.println(p[i]);
            }
            for (i = 0; i < e; i++) {
                System.out.println("*" + q[i]);
            }
            d3 = 0;
            for (i = 0; i < v; i++) {
                f1 = true;
                for (o2 = 0; o2 < f4; o2++) {
                    if (i == p[o2]) {
                        f1 = false;
                    }
                    if (!f1) {
                        break;
                    }
                }
                if (f1) {
                    d3++;
                    if (d3 == 1) {
                        for (j = 0; j < l; j++) {
                            f2 = true;
                            for (k = 0; k < e; k++) {
                                if (j == q[k]) {
                                    f2 = false;
                                }
                                if (!f2) {
                                    break;
                                }
                            }
                            if (f2) {
                                System.out.print(o1[j]);
                                if (j != l - 1) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    for (j = 0; j < l; j++) {
                        f3 = true;
                        for (k = 0; k < e; k++) {
                            if (j == q[k]) {
                                f3 = false;
                            }
                        }
                        if (f3) {
                            System.out.print(h2[i][j]);
                        }
                    }
                    for (j = n; j < o[i]; j++) {
                        if (j == n) {
                            System.out.print(" ");
                        }
                        System.out.print(h[i][j]);
                        if (j < o[i] - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                }
            }
        }
        for (i = 0; i < f4; i++) {
            System.out.println(p[i]);
        }
        for (i = 0; i < e; i++) {
            System.out.println("*" + q[i]);
        }
        d3=0;
        for (i = 0; i < v; i++) {
            f1=true;
            for (o2 = 0; o2 < f4; o2++) {
                if (i == p[o2]) {
                    f1=false;
                }
                if(!f1){
                    break;
                }
            }
            if (f1) {
                d3++;
                if (d3 == 1) {
                    for (j = 0; j < l; j++) {
                        f2 = true;
                        for (k = 0; k < e; k++) {
                            if (j == q[k]) {
                                f2 = false;
                            }
                            if (!f2) {
                                break;
                            }
                        }
                        if (f2) {
                            System.out.print(o1[j]);
                            if (j != l - 1) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();
                }
                for (j = 0; j < l; j++) {
                    f3 = true;
                    for (k = 0; k < e; k++) {
                        if (j == q[k]) {
                            f3 = false;
                        }
                    }
                    if (f3) {
                        System.out.print(h2[i][j]);
                    }
                }
                for (j = n; j < o[i]; j++) {
                    if (j == n) {
                        System.out.print(" ");
                    }
                    System.out.print(h[i][j]);
                    if (j < o[i] - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
        for (i = 0; i < f4; i++) {
            f1=true;
            for (i1 = 0; i1 < e2; i1++) {
                if (p[i] == q2[i1]) {
                    f1=false;
                }
            }
            if (f1) {
                for (j = 0; j < o[p[i]]; j++) {
                    System.out.print(h[p[i]][j]);
                    if (j == n - 1) {
                        System.out.print(" ");
                    }
                    if (j > n - 1 && j<o[p[i]]-1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < c17; i++) {
            for (j = 0; j < bo[i]; j++) {
                cb[ef[i][j][0]][ef[i][j][1]].bn = new boolean[]{false, false, false, false};
                cb[ef[i][j][0]][ef[i][j][1]].color = new Color[]{null, null, null, null};
                if(ef[i][j][0]<z3 && ef[i][j][1]<x3){
                    b[ef[i][j][0]][ef[i][j][1]].setBorder(new CustomBorder( cb[ef[i][j][0]][ef[i][j][1]].color,cb[ef[i][j][0]][ef[i][j][1]].bn));
                }
            }
        }
        bo = new int[bl1];
        c9 =0;
        c15 =0;
        c8 =0;
        c17 =0;
        for (i = 0; i < f4; i++) {
            f1=true;
            c7 =0;
            c16=0;
            c18 =0;
            for (i1 = 0; i1 < e2; i1++) {
                if (p[i] == q2[i1]) {
                    f1=false;
                }
            }
            if (f1) {
                if(!b2){
                    sb.append("(");
                }
                if(c15!=0) {
                    if(b2){sb.append(" + ");}
                }
                c15++;
                for (j = 0; j < o[p[i]]; j++) {
                    if(h[p[i]][j]==1 && j<n){
                        c9++;
                        if(r2c[c7]>1) {
                            System.out.print("("+r2[c7]+")");
                            if(b2){sb.append("(").append(r2[c7]).append(")");}
                            if(!b2){
                                if(c16!=0){sb.append("+");}
                                sb.append("(").append(r2[c7]).append(")");}
                        }
                        else{
                            System.out.print(r2[c7]);
                            if(b2){sb.append(r2[c7]);}
                            if(!b2){
                                if(c16!=0){sb.append("+");}
                                sb.append(r2[c7]);}
                        }
                        c16++;
                    }
                    if(h[p[i]][j]==0 && j<n){
                        c9++;
                        if(r2c[c7]>1) {
                            System.out.print("(" + r2[c7] + "'" + ")");
                            if(b2){sb.append("(").append(r2[c7]).append(")").append("'");}
                            if(!b2){
                                if(c16!=0){sb.append("+");}
                                sb.append("(").append(r2[c7]).append(")").append("'");}
                        }
                        else{
                            System.out.print(r2[c7]+"'");
                            if(b2){sb.append(r2[c7]).append("'");}
                            if(!b2){
                                if(c16!=0){sb.append("+");}
                                sb.append(r2[c7]).append("'");
                            }
                        }
                        c16++;
                    }
                    if(h[p[i]][j] == -1){c8++;}
                    if(j>=n){
                        System.out.print(h[p[i]][j]);
                        bor[c17][c18] = h[p[i]][j];
                        c18++;
                    }
                    if (j == n - 1) {
                        System.out.print(" ");
                    }
                    if (j > n - 1 && j<o[p[i]]-1) {
                        System.out.print(",");
                    }
                    c7++;
                }
                System.out.println();
                if(!b2){
                    sb.append(")");
                }
                bo[c17] = c18;
                c17++;
            }
        }
        if(c8==num && c15 ==1){ sb = new StringBuilder();
            sb.append("1");}
        else if(f4 == 0 || c9==0){ sb =new StringBuilder();
            sb.append("0");}
        String s6 = sb.toString();
        sol.setText("\n" + "     Solution:"+"\n             "+s6);
        System.out.println(sb);
        border(bor,bo,c17);
    }
    public static void border(int[][] bor, int[] bo, int k){
        int i,j,l,m=num/2,n=num-m,o=power(m),p=power(n),q = 0,r=0,s=0,t=0,u,c,di;
        cb = new CB[power(num/2)][power(num-(num/2))];
        boolean[] bon;
        Color[] col;
        ef =new int[power(num-1)][bl1+1][2];
        for(i=0;i<k;i++){
            for(j=0;j<bo[i];j++){
                for(l=0;l<bl1;l++) {
                    if (bor[i][j] ==z1[l]){
                       ef[i][j][0] = d[l][0];
                       ef[i][j][1] = d[l][1];
                       break;
                    }
                }
            }
        }
        for(i=0;i<k;i++){
            for(j=0;j<bo[i];j++) {
                cb[ef[i][j][0]][ef[i][j][1]] = new CB();
                cb[ef[i][j][0]][ef[i][j][1]].bn = new boolean[]{false, false, false, false};
                cb[ef[i][j][0]][ef[i][j][1]].color = new Color[]{null, null, null, null};
            }
        }
        int cn =0;
        for(i=0;i<k;i++){
            for(j=0;j<bo[i];j++){
                c=0;di=0;
                col =new Color[]{Color.decode(ColourValues[cn]), Color.decode(ColourValues[cn]),
                        Color.decode(ColourValues[cn]), Color.decode(ColourValues[cn])};
                bon= new boolean[]{true, true, true, true};
                for(l=0;l<bo[i];l++){
                    if(j!=l){
                        if(ef[i][j][0]==0){q = o-1;}
                        else if(ef[i][j][0]!=0){q=ef[i][j][0]-1;}
                        if(ef[i][j][1]==0){r=p-1;}
                        else if(ef[i][j][1]!=0){r=ef[i][j][1]-1;}
                        if(ef[i][j][0]==o-1){s = 0;}
                        else if(ef[i][j][0]!=o-1){s=ef[i][j][0]+1;}
                        if(ef[i][j][1]==p-1){t=0;}
                        else if(ef[i][j][1]!=p-1){t=ef[i][j][1]+1;}
                        if(ef[i][j][0]==ef[i][l][0] && t==ef[i][l][1]){
                            bon[3]=false;
                        }
                        if(s==ef[i][l][0] && ef[i][j][1]==ef[i][l][1]){
                            bon[1]=false;
                        }
                        if(q==ef[i][l][0] && ef[i][j][1]==ef[i][l][1]){
                            bon[0]=false;
                        }
                        if(ef[i][j][0]==ef[i][l][0] && r==ef[i][l][1]){
                            bon[2]=false;
                        }
                        if(ef[i][j][0]==ef[i][l][0]){
                            c++;
                            if(c==p-1){
                                if(ef[i][j][1]==0){bon[2]=true;}
                                if(ef[i][j][1]==p-1){bon[3]=true;}
                            }
                        }
                        if(ef[i][j][1]==ef[i][l][1]){
                            di++;
                            if(di==o-1){
                                if(ef[i][j][0]==0){bon[0]=true;}
                                if(ef[i][j][0]==o-1){bon[1]=true;}
                            }
                        }
                    }
                }
                for(u=0;u<4;u++){
                    if(cb[ef[i][j][0]][ef[i][j][1]].bn[u] && bon[u] ) {
                        cb[ef[i][j][0]][ef[i][j][1]].color[u] = col[u];
                    }
                    if(!cb[ef[i][j][0]][ef[i][j][1]].bn[u] && bon[u] ) {
                        cb[ef[i][j][0]][ef[i][j][1]].bn[u] = bon[u];
                        cb[ef[i][j][0]][ef[i][j][1]].color[u] = col[u];
                    }
                }
                b[ef[i][j][0]][ef[i][j][1]].setBorder(new CustomBorder( cb[ef[i][j][0]][ef[i][j][1]].color,cb[ef[i][j][0]][ef[i][j][1]].bn));
            }
            cn++;
            if(cn == 62){cn=0;}
        }
    }
    static class CB {
        Color[] color;
        boolean[] bn;
    }
    public static void dtb1(int x, int n) {
        int i = n - 1, k, c = 0;
        int[] a = new int[200];
        if (x != 0) {
            for (k = x; k > 1; k = k / 2) {
                a[i] = k % 2;
                if (a[i] == 1) {
                    c++;
                }
                i = i - 1;
            }
            a[i] = k;
            if (a[i] == 1) {
                c++;
            }
        }
        else {
            a[0] = 0;
        }
        if (c >= s) {
            s = c+1;
        }
        for (i = 0; i < n; i++) {
            f[c][in[c]][i] = a[i];
        }
        f[c][in[c]][n]=x;
        in[c] += 1;
    }
}