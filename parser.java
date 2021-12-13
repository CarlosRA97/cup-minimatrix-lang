
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\007\002\000\002\002\011\000\002\002" +
    "\004\000\002\002\007\000\002\010\002\000\002\002\010" +
    "\000\002\002\006\000\002\003\005\000\002\003\006\000" +
    "\002\003\005\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\011\002\000\002\004\006\000\002\012" +
    "\002\000\002\004\006\000\002\004\003\000\002\006\003" +
    "\000\002\006\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\024\004\025\005\001\002\000\004\006" +
    "\047\001\002\000\004\014\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\uffff\001\002\000\016\006\012\010" +
    "\014\021\011\022\017\023\016\025\015\001\002\000\004" +
    "\006\uffec\001\002\000\016\006\012\010\014\021\011\022" +
    "\017\023\016\025\015\001\002\000\004\006\042\001\002" +
    "\000\006\011\031\026\030\001\002\000\012\007\ufff7\013" +
    "\ufff7\015\ufff7\017\ufff7\001\002\000\004\006\uffeb\001\002" +
    "\000\004\006\uffed\001\002\000\010\013\024\015\021\017" +
    "\022\001\002\000\016\006\uffef\010\uffef\021\uffef\022\uffef" +
    "\023\uffef\025\uffef\001\002\000\016\006\uffee\010\uffee\021" +
    "\uffee\022\uffee\023\uffee\025\uffee\001\002\000\016\006\012" +
    "\010\014\021\011\022\017\023\016\025\015\001\002\000" +
    "\010\002\ufffb\024\ufffd\025\ufffd\001\002\000\006\024\004" +
    "\025\005\001\002\000\004\002\ufffc\001\002\000\012\007" +
    "\ufff8\013\ufff8\015\021\017\022\001\002\000\010\011\ufff0" +
    "\012\ufff0\013\ufff0\001\002\000\012\007\ufff5\013\ufff5\015" +
    "\ufff5\017\ufff5\001\002\000\010\011\034\012\033\013\035" +
    "\001\002\000\004\026\ufff4\001\002\000\012\007\ufffa\013" +
    "\ufffa\015\ufffa\017\ufffa\001\002\000\004\026\ufff2\001\002" +
    "\000\004\026\030\001\002\000\010\011\ufff1\012\ufff1\013" +
    "\ufff1\001\002\000\004\026\030\001\002\000\010\011\ufff3" +
    "\012\ufff3\013\ufff3\001\002\000\016\006\012\010\014\021" +
    "\011\022\017\023\016\025\015\001\002\000\010\007\044" +
    "\015\021\017\022\001\002\000\012\007\ufff9\013\ufff9\015" +
    "\ufff9\017\ufff9\001\002\000\010\007\046\015\021\017\022" +
    "\001\002\000\012\007\ufff6\013\ufff6\015\ufff6\017\ufff6\001" +
    "\002\000\016\006\012\010\014\021\011\022\017\023\016" +
    "\025\015\001\002\000\010\007\051\015\021\017\022\001" +
    "\002\000\004\013\052\001\002\000\010\002\ufffe\024\001" +
    "\025\001\001\002\000\006\024\004\025\005\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\017\005\012\001\001\000\002\001\001\000\006\003" +
    "\044\005\012\001\001\000\002\001\001\000\004\004\031" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\026\005\012\001\001\000\004\010" +
    "\024\001\001\000\004\002\025\001\001\000\002\001\001" +
    "\000\004\006\022\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\037\001\001\000\002" +
    "\001\001\000\004\012\035\001\001\000\004\004\036\001" +
    "\001\000\002\001\001\000\004\004\040\001\001\000\002" +
    "\001\001\000\006\003\042\005\012\001\001\000\004\006" +
    "\022\001\001\000\002\001\001\000\004\006\022\001\001" +
    "\000\002\001\001\000\006\003\047\005\012\001\001\000" +
    "\004\006\022\001\001\000\002\001\001\000\004\007\052" +
    "\001\001\000\004\002\053\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    ArrayList<ArrayList<Double>> mat = new ArrayList();
    ArrayList<Double> row = new ArrayList();

    ArrayList<ArrayList<Double>> newRow(ArrayList<ArrayList<Double>> m) {
        m.add(row);
        row = new ArrayList<>();
        return m;
    }

    ArrayList<ArrayList<Double>> addRowValue(ArrayList<ArrayList<Double>> m, double n) {
        row.add(n);
        return m;
    }

    ArrayList<ArrayList<Double>> newMat() {
        return new ArrayList<>();
    }

    ArrayList<ArrayList<Double>> doOperation(int op, ArrayList<ArrayList<Double>> _m1, ArrayList<ArrayList<Double>> _m2) {
        double[][] result = null;
        try {
            double[][] m1 = Matrices.toArray(_m1);
            double[][] m2 = Matrices.toArray(_m2);
            // System.out.println("<1> "+ o);
            // System.out.println("<m1> " + Matrices.toArrayList(m1) + "\n<m2> " + Matrices.toArrayList(m2));
            switch (op) {
                case 0:
                    result = Matrices.producto(m1, m2); 
                    break;
                case 1:
                    result = Matrices.suma(m1, m2); 
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e.getMessage());
            printError(4+op);
        } finally {
            mat = newMat();
        }
        return result != null ? Matrices.toArrayList(result) : null;
    }

    ArrayList<ArrayList<Double>> doFunction(int op, ArrayList<ArrayList<Double>> _m) {
        double[][] result = null;
        try {
            double[][] m = Matrices.toArray(_m);

            switch (op) {
                case 0:
                    result = Matrices.transpuesta(m);
                    break;
                case 1:
                    if (m.length == m[m.length-1].length) {
                        result = Matrices.inversa(m);
                    } else {
                        printError(1+op);
                    }
                    break;
                case 2:
                    result = Matrices.adjunta(m);
                    break;
                default:
                    break;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            printError(1+op);
        }
        return result != null ? Matrices.toArrayList(result) : null;
    }

    ArrayList<ArrayList<Double>> checkMatrix(ArrayList<ArrayList<Double>> m) {

        mat = newMat();
        try {
            if (m.size() == 0) {
                printError(0);
                return mat;
            }
            return m;
        } catch (IndexOutOfBoundsException e) {
            printError(1);

        }

        return mat;
    }

    void printError(int err) { 
        String errMsg = "Syntax error";
        switch (err) {
            case 1:
                errMsg = Matrices.ERROR_FILAS;
                break;
            case 2:
                errMsg = Matrices.ERROR_INVERSA;
                break;
            case 3:
                errMsg = Matrices.ERROR_ADJUNTA;
                break;
            case 4:
                errMsg = Matrices.ERROR_PROD;
                break;
            case 5:
                errMsg = Matrices.ERROR_SUMA;
                break;
            default:
                break;
        }
        System.out.print(errMsg);
    }

    void print(double[][] mat) {
        if (mat != null) {
            Matrices.print(mat);
        }
    }

    void print(ArrayList<ArrayList<Double>> mat) {
        try {
            if (mat != null) {
                Matrices.print(mat);
            }
        } catch (Exception e) {
            printError(1);
        }
    }

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 print(res); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // linea ::= PRINT AP exp CP PYC NT$0 linea 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= linea EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= PRINT AP exp CP PYC 
            {
              Object RESULT =null;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 print(res); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$1 ::= 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 TablaSimbolos.insertar(id, Matrices.toArray(res)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // linea ::= IDENT ASIG exp PYC NT$1 linea 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // linea ::= IDENT ASIG exp PYC 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> res = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 TablaSimbolos.insertar(id, Matrices.toArray(res)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= AC mat CC 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> m = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = checkMatrix(newRow(m)); mat = newMat(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= func AP exp CP 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int m1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> m1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = doFunction(f, m1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= exp op exp 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int m1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int m1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<ArrayList<Double>> m1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer o = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int m2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int m2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ArrayList<ArrayList<Double>> m2 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = doOperation(o, m1, m2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= IDENT 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Matrices.toArrayList(TablaSimbolos.buscar(n)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= AP exp CP 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> m = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = m; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= AC CC 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		 System.out.print("Syntax error"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$2 ::= 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> e1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 RESULT = e1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // mat ::= mat COMA NT$2 mat 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (ArrayList<ArrayList<Double>>) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		ArrayList<ArrayList<Double>> e1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ArrayList<ArrayList<Double>> e2 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mat",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$3 ::= 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<ArrayList<Double>> e1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 RESULT = newRow(e1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // mat ::= mat PYC NT$3 mat 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (ArrayList<ArrayList<Double>>) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		ArrayList<ArrayList<Double>> e1 = (ArrayList<ArrayList<Double>>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mat",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // mat ::= NUMERO 
            {
              ArrayList<ArrayList<Double>> RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = addRowValue(mat, n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mat",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // op ::= MAS 
            {
              Integer RESULT =null;
		 RESULT = 1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // op ::= POR 
            {
              Integer RESULT =null;
		 RESULT = 0; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // func ::= TRANSPUESTA 
            {
              Integer RESULT =null;
		 RESULT = 0; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("func",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // func ::= INVERSA 
            {
              Integer RESULT =null;
		 RESULT = 1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("func",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // func ::= ADJUNTA 
            {
              Integer RESULT =null;
		 RESULT = 2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("func",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
