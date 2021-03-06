package pilots.compiler;

import java.io.*;
import pilots.Version;
import pilots.compiler.parser.*;
import pilots.compiler.codegen.*;

public class PilotsCompiler {
    PilotsParser parser_ = null;
    PilotsCodeGenerator codegen_ = null;
    String file_ = null;

    public static void main( String[] args ) {
        System.out.println( "PILOTS Compiler v" + Version.ver + " compiling " + args[0] + "..." );
        PilotsCompiler compiler = new PilotsCompiler( args );
        compiler.compile();
    }
        
    public PilotsCompiler( String[] args ) {
        file_ = args[0];
        codegen_ = new PilotsCodeGenerator();
    }

    public void compile() {
        try {
            parser_ = new PilotsParser( new FileReader( file_ ) ); // setting a static input stream
            Node node = parser_.Pilots(); 
            codegen_ = new PilotsCodeGenerator();
            node.jjtAccept( codegen_, null );
        } 
        catch ( FileNotFoundException ex ) {
            System.err.println( "FileNotFoundException: " +  ex.getMessage() );
        }
        catch ( TokenMgrError ex ) {
            System.err.println( "TokeMgrError: " +  ex.getMessage() );
        }
        catch ( ParseException ex ) {
            System.err.println( "ParseException: " +  ex.getMessage() );
        }

    }
}
        
