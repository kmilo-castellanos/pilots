/* Generated By:JJTree: Do not edit this line. ASTFeatures.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.trainer_parser;

public
class ASTFeatures extends SimpleNode {
  public ASTFeatures(int id) {
    super(id);
  }

  public ASTFeatures(PilotsParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PilotsParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e647ea4af406ba42fdecef8e57e6520b (do not edit this line) */