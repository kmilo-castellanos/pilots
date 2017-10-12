/* Generated By:JavaCC: Do not edit this line. PilotsParserVisitor.java Version 5.0 */
package pilots.compiler.parser;

public interface PilotsParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTPilots node, Object data);
  public Object visit(ASTInput node, Object data);
  public Object visit(ASTOutput node, Object data);
  public Object visit(ASTError node, Object data);
  public Object visit(ASTSignature node, Object data);
  public Object visit(ASTEstimate node, Object data);
  public Object visit(ASTCorrect node, Object data);
  public Object visit(ASTVars node, Object data);
  public Object visit(ASTConst node, Object data);
  public Object visit(ASTDim node, Object data);
  public Object visit(ASTMethod node, Object data);
  public Object visit(ASTMethods node, Object data);
  public Object visit(ASTTime node, Object data);
  public Object visit(ASTExps node, Object data);
  public Object visit(ASTExp node, Object data);
  public Object visit(ASTExp2 node, Object data);
  public Object visit(ASTFunc node, Object data);
  public Object visit(ASTNumber node, Object data);
  public Object visit(ASTValue node, Object data);
}
/* JavaCC - OriginalChecksum=9ee973219314775b50967740785ac837 (do not edit this line) */
