/* Generated By:JJTree&JavaCC: Do not edit this line. PilotsParserTokenManager.java */
package pilots.compiler.parser;
import java.io.*;

/** Token Manager. */
public class PilotsParserTokenManager implements PilotsParserConstants
{
  static int commentNesting;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fffffffc00L) != 0L)
         {
            jjmatchedKind = 50;
            return 1;
         }
         if ((active0 & 0x180000000000000L) != 0L)
            return 14;
         return -1;
      case 1:
         if ((active0 & 0x37ffffdfc00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 1;
            }
            return 1;
         }
         if ((active0 & 0x8000020000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0xe29ffdfc00L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x31d60000000L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x2fdfc00L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0xe29d000000L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0xf8fc00L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x2050000L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0xf8d400L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x2800L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0xb04000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x489400L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x800000L) != 0L)
            return 1;
         if ((active0 & 0x304000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x100000L) != 0L)
            return 1;
         if ((active0 & 0x204000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      case 9:
         if ((active0 & 0x4000L) != 0L)
            return 1;
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x20L, 0x0L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1L);
      case 40:
         return jjStopAtPos(0, 43);
      case 41:
         return jjStopAtPos(0, 44);
      case 42:
         return jjStopAtPos(0, 57);
      case 43:
         return jjStartNfaWithStates_0(0, 55, 14);
      case 44:
         return jjStopAtPos(0, 45);
      case 45:
         return jjStartNfaWithStates_0(0, 56, 14);
      case 47:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x40L, 0x0L);
      case 58:
         return jjStopAtPos(0, 53);
      case 59:
         return jjStopAtPos(0, 52);
      case 60:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x8000000000000000L, 0x0L);
      case 61:
         return jjStopAtPos(0, 54);
      case 62:
         jjmatchedKind = 60;
         return jjMoveStringLiteralDfa1_0(0x2000000000000000L, 0x0L);
      case 94:
         return jjStopAtPos(0, 59);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1e000020000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800088000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000942000L, 0x0L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200800L, 0x0L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x50000000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000L, 0x0L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x1000L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400400L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x620004000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1002000000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x8010000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 61:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         else if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1100000000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L, active1, 0L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L, active1, 0L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x442004000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000200800L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x880008000L, active1, 0L);
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x402400L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x201c810000L, active1, 0L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x101000L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 99:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 100:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 41, 1);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1d440000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000010000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 1);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 1);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 1);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000080400L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000a000L);
      case 115:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 1);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0xa01000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 121:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 1);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 1);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 1);
         break;
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 1);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 1);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x14000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 114:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x48000L);
      case 115:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x88000L);
      case 103:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x500000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x202400L);
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 121:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800400L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x408000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 1);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x5000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 109:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 1);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 1);
         break;
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 1);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 1);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000L);
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(8, 20, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(9, 14, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(10, 21, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(6);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 3:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 34 && kind > 51)
                     kind = 51;
                  break;
               case 5:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar != 46)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  jjAddStates(3, 4);
                  break;
               case 10:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x200L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 47:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   6, 7, 8, 3, 4, 11, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, 
"\160\162\157\147\162\141\155", "\151\156\160\165\164\163", "\157\165\164\160\165\164\163", 
"\145\162\162\157\162\163", "\163\151\147\156\141\164\165\162\145\163", "\143\157\162\162\145\143\164", 
"\165\163\151\156\147", "\141\164", "\145\166\145\162\171", "\143\154\157\163\145\163\164", 
"\145\165\143\154\151\144\145\141\156", "\151\156\164\145\162\160\157\154\141\164\145", 
"\160\162\145\144\151\143\164", "\145\163\164\151\155\141\164\145", "\167\150\145\156", 
"\164\151\155\145\163", "\156\163\145\143", "\165\163\145\143", "\155\163\145\143", "\163\145\143", 
"\155\151\156", "\150\157\165\162", "\144\141\171", "\163\161\162\164", "\163\151\156", 
"\143\157\163", "\164\141\156", "\141\163\151\156", "\141\143\157\163", "\141\164\141\156", 
"\141\142\163", "\145\156\144", null, "\50", "\51", "\54", null, null, null, null, null, null, 
"\73", "\72", "\75", "\53", "\55", "\52", "\57", "\136", "\76", "\76\75", "\74", 
"\74\75", "\41\75", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffd7bfffffffc01L, 0x1L, 
};
static final long[] jjtoSkip = {
   0x37eL, 0x0L, 
};
static final long[] jjtoMore = {
   0x80L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[14];
private final int[] jjstateSet = new int[28];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public PilotsParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PilotsParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 7)
         {
            jjmatchedKind = 7;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          commentNesting=1;
         break;
      case 8 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
             commentNesting++;
         break;
      case 9 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
             commentNesting--; if (commentNesting==0) SwitchTo(DEFAULT);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
