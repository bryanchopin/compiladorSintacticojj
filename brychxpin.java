/* brychxpin.java */
/* Generated By:JavaCC: Do not edit this line. brychxpin.java */
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class brychxpin implements brychxpinConstants {
        public static List <String> listaB = new ArrayList<String> ();
        public static void Contador(String Campo)
        {
                int Ubicacion=brychxpin.listaB.indexOf(Campo);
                if (Ubicacion==-1)
                {
                        brychxpin.listaB.add(Campo);
                        Ubicacion=brychxpin.listaB.indexOf(Campo);
                        System.out.print(Ubicacion);
                }
                else
                {
                        System.out.print(Ubicacion);
                }
        }
        public static void main (String[]args)throws ParseException
        {
                try
                {
                        brychxpin analizador = new brychxpin(System.in);
                        analizador.Inicio();
                        System.out.print("\n\t Compilado con exito brychxpin \n\n");
                }
                catch(ParseException e)
                {
                        System.out.println(e.getMessage());
                        System.out.print("\n\t No Compilado brychxpin \n\n");
                }
        }

  static final public void Flower() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FrandomList() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(random);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(Tdato);
    jj_consume_token(COMA);
    jj_consume_token(numero);
    jj_consume_token(PAR_DER);
    jj_consume_token(PUNTO);
    jj_consume_token(EDD);
}

  static final public void FrandomTuple() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(random);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(Tdato);
    jj_consume_token(COMA);
    jj_consume_token(numero);
    jj_consume_token(PAR_DER);
    jj_consume_token(PUNTO);
    jj_consume_token(Tdato);
}

  static final public void Fisdecimal() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void Frandom() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(random);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(Tdato);
    jj_consume_token(COMA);
    jj_consume_token(numero);
    jj_consume_token(PAR_DER);
}

  static final public void FlistHTML() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(EDD);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(etiquetas);
    jj_consume_token(PAR_DER);
}

  static final public void Fpht() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(etiquetas);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(EDD);
    jj_consume_token(PAR_DER);
}

  static final public void FisChar() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FisDouble() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FisString() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FisBolean() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void Fislist() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(EDD);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
    jj_consume_token(DOS_PUNTOS);
}

  static final public void FisTuple() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(Tdato);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
    jj_consume_token(DOS_PUNTOS);
}

  static final public void FisArray() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(EDD);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
    jj_consume_token(DOS_PUNTOS);
}

  static final public void FisStack() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(EDD);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
    jj_consume_token(DOS_PUNTOS);
}

  static final public void FisTrue() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(booleano);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
}

  static final public void FisFalse() throws ParseException {
    jj_consume_token(condicional);
    jj_consume_token(booleano);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
}

  static final public void Fsplit() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(PUNTO);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(COMA);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
}

  static final public void Freplace() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(PUNTO);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(ID);
    jj_consume_token(COMA);
    jj_consume_token(ID);
    jj_consume_token(PAR_DER);
}

  static final public void FisNum() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FisAssci() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void FisDigit() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Fstring);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(PAR_DER);
}

  static final public void fAlert() throws ParseException {
    jj_consume_token(Fmensaje);
    jj_consume_token(PAR_IZQ);
    jj_consume_token(COMILLA);
    jj_consume_token(ID);
    jj_consume_token(COMILLA);
    jj_consume_token(PAR_DER);
}

  static final public void metodo() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASIGANCION);
    jj_consume_token(Tdato);
    jj_consume_token(dentro);
    jj_consume_token(salto);
}

  static final public void funciones() throws ParseException {
    Flower();
    FrandomList();
    FrandomTuple();
    Fisdecimal();
    Frandom();
    FlistHTML();
    Fpht();
    FisChar();
    FisDouble();
    FisString();
    FisBolean();
    Fislist();
    FisTuple();
    FisArray();
    FisStack();
    FisTrue();
    FisFalse();
    Fsplit();
    Freplace();
    FisNum();
    FisAssci();
    FisDigit();
    fAlert();
}

  static final public void Inicio() throws ParseException {
    label_1:
    while (true) {
      jj_consume_token(LLAVE_IZQ);
      label_2:
      while (true) {
        funciones();
        label_3:
        while (true) {
          metodo();
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case ID:{
            ;
            break;
            }
          default:
            jj_la1[0] = jj_gen;
            break label_3;
          }
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      jj_consume_token(LLAVE_DER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LLAVE_IZQ:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public brychxpinTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x0,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x10000,0x10000,0x4,};
	}

  /** Constructor with InputStream. */
  public brychxpin(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public brychxpin(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new brychxpinTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public brychxpin(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new brychxpinTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new brychxpinTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public brychxpin(brychxpinTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(brychxpinTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[55];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 3; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 55; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
