/* Generated By:JJTree: Do not edit this line. ASTTraining.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.trainer_parser;

public
class ASTTraining extends SimpleNode {
  public ASTTraining(int id) {
    super(id);
  }

  public ASTTraining(PilotsParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PilotsParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9e65f3267c285d3032c53589c440aa36 (do not edit this line) */