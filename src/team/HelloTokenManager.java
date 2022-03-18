/* Generated By:JavaCC: Do not edit this line. HelloTokenManager.java */
package team;
import java.io.StringReader;

/** Token Manager. */
public class HelloTokenManager implements HelloConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000L) != 0L)
            return 33;
         if ((active0 & 0x2000L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStartNfaWithStates_0(0, 12, 33);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(2, 13);
         break;
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 108:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(3, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 152;
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
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 4);
                  else if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(5, 9);
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 13);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(5, 9);
                  break;
               case 37:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(5, 9);
                  break;
               case 38:
                  if (curChar == 34 && kind > 17)
                     kind = 17;
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 4);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(14, 19);
                  break;
               case 45:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 46:
                  if (curChar == 34)
                     jjCheckNAddStates(20, 23);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(24, 28);
                  break;
               case 51:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(24, 28);
                  break;
               case 52:
                  if (curChar == 34 && kind > 7)
                     kind = 7;
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(29, 33);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(34, 39);
                  break;
               case 62:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 66:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 67:
                  if (curChar == 34)
                     jjCheckNAddStates(40, 43);
                  break;
               case 71:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(44, 48);
                  break;
               case 72:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(44, 48);
                  break;
               case 73:
                  if (curChar == 34 && kind > 8)
                     kind = 8;
                  break;
               case 77:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(49, 53);
                  break;
               case 78:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(54, 59);
                  break;
               case 84:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 88:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 89:
                  if (curChar == 34)
                     jjCheckNAddStates(60, 63);
                  break;
               case 93:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(64, 68);
                  break;
               case 94:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(64, 68);
                  break;
               case 98:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(69, 73);
                  break;
               case 99:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(74, 79);
                  break;
               case 104:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 103;
                  break;
               case 108:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 109:
                  if (curChar == 34)
                     jjCheckNAddStates(80, 83);
                  break;
               case 113:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(84, 88);
                  break;
               case 114:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(84, 88);
                  break;
               case 115:
                  if (curChar == 34 && kind > 11)
                     kind = 11;
                  break;
               case 119:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(89, 93);
                  break;
               case 120:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(94, 99);
                  break;
               case 125:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 124;
                  break;
               case 129:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 130;
                  break;
               case 130:
                  if (curChar == 34)
                     jjCheckNAddStates(100, 103);
                  break;
               case 134:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(104, 108);
                  break;
               case 135:
                  if ((0x400c04300000000L & l) != 0L)
                     jjCheckNAddStates(104, 108);
                  break;
               case 136:
                  if (curChar == 34 && kind > 18)
                     kind = 18;
                  break;
               case 140:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(109, 113);
                  break;
               case 141:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(114, 119);
                  break;
               case 148:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 147;
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
               case 33:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(120, 124);
                  else if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(125, 129);
                  else if (curChar == 95)
                     jjCheckNAddStates(5, 9);
                  break;
               case 2:
                  if (curChar == 87)
                     jjAddStates(130, 134);
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 26;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
                  if (curChar == 68 && kind > 5)
                     kind = 5;
                  break;
               case 1:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 3:
                  if (curChar == 84 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 88)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 69 && kind > 16)
                     kind = 16;
                  break;
               case 8:
                  if (curChar == 71)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 71 && kind > 16)
                     kind = 16;
                  break;
               case 13:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 72 && kind > 16)
                     kind = 16;
                  break;
               case 20:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 71)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 75 && kind > 16)
                     kind = 16;
                  break;
               case 29:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 34:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(5, 9);
                  break;
               case 35:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(5, 9);
                  break;
               case 37:
                  if (curChar == 95)
                     jjCheckNAddStates(5, 9);
                  break;
               case 39:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(135, 140);
                  break;
               case 40:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(120, 124);
                  break;
               case 41:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(141, 146);
                  break;
               case 44:
                  if (curChar == 87)
                     jjAddStates(130, 134);
                  break;
               case 47:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(147, 151);
                  break;
               case 48:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(24, 28);
                  break;
               case 49:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(24, 28);
                  break;
               case 51:
                  if (curChar == 95)
                     jjCheckNAddStates(24, 28);
                  break;
               case 53:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(152, 157);
                  break;
               case 54:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(158, 162);
                  break;
               case 55:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(163, 168);
                  break;
               case 58:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 59:
                  if (curChar == 88)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 63:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 68:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(169, 173);
                  break;
               case 69:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(44, 48);
                  break;
               case 70:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(44, 48);
                  break;
               case 72:
                  if (curChar == 95)
                     jjCheckNAddStates(44, 48);
                  break;
               case 74:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(174, 179);
                  break;
               case 75:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(180, 184);
                  break;
               case 76:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(185, 190);
                  break;
               case 79:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 80:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 85:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 90:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(191, 195);
                  break;
               case 91:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(64, 68);
                  break;
               case 92:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(64, 68);
                  break;
               case 94:
                  if (curChar == 95)
                     jjCheckNAddStates(64, 68);
                  break;
               case 95:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(196, 201);
                  break;
               case 96:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(202, 206);
                  break;
               case 97:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(207, 212);
                  break;
               case 100:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 101:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 105:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 106:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 105;
                  break;
               case 107:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 106;
                  break;
               case 110:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(213, 217);
                  break;
               case 111:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(84, 88);
                  break;
               case 112:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(84, 88);
                  break;
               case 114:
                  if (curChar == 95)
                     jjCheckNAddStates(84, 88);
                  break;
               case 116:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(218, 223);
                  break;
               case 117:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(224, 228);
                  break;
               case 118:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(229, 234);
                  break;
               case 121:
                  if (curChar == 75)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 122:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 121;
                  break;
               case 123:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 122;
                  break;
               case 124:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 123;
                  break;
               case 126:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 125;
                  break;
               case 127:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 126;
                  break;
               case 128:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 127;
                  break;
               case 131:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(235, 239);
                  break;
               case 132:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(104, 108);
                  break;
               case 133:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(104, 108);
                  break;
               case 135:
                  if (curChar == 95)
                     jjCheckNAddStates(104, 108);
                  break;
               case 137:
                  if ((0x7fffffe00000000L & l) != 0L)
                     jjCheckNAddStates(240, 245);
                  break;
               case 138:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(246, 250);
                  break;
               case 139:
                  if ((0x7fffffeL & l) != 0L)
                     jjCheckNAddStates(251, 256);
                  break;
               case 142:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 129;
                  break;
               case 143:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 142;
                  break;
               case 144:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 143;
                  break;
               case 145:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 144;
                  break;
               case 146:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 145;
                  break;
               case 147:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 146;
                  break;
               case 149:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 148;
                  break;
               case 150:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 149;
                  break;
               case 151:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 150;
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
      if ((i = jjnewStateCnt) == (startsAt = 152 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   35, 34, 37, 38, 43, 35, 34, 36, 37, 38, 33, 40, 42, 37, 35, 34, 
   36, 37, 38, 43, 47, 54, 56, 51, 49, 48, 50, 51, 52, 49, 48, 51, 
   52, 57, 49, 48, 50, 51, 52, 57, 68, 75, 77, 72, 70, 69, 71, 72, 
   73, 70, 69, 72, 73, 78, 70, 69, 71, 72, 73, 78, 90, 96, 98, 94, 
   92, 91, 93, 94, 73, 92, 91, 94, 73, 99, 92, 91, 93, 94, 73, 99, 
   110, 117, 119, 114, 112, 111, 113, 114, 115, 112, 111, 114, 115, 120, 112, 111, 
   113, 114, 115, 120, 131, 138, 140, 135, 133, 132, 134, 135, 136, 133, 132, 135, 
   136, 141, 133, 132, 134, 135, 136, 141, 35, 36, 37, 38, 41, 34, 36, 37, 
   38, 39, 65, 87, 107, 128, 151, 35, 34, 36, 37, 38, 39, 35, 34, 36, 
   37, 38, 41, 48, 50, 51, 52, 53, 49, 48, 50, 51, 52, 53, 49, 50, 
   51, 52, 55, 49, 48, 50, 51, 52, 55, 69, 71, 72, 73, 74, 70, 69, 
   71, 72, 73, 74, 70, 71, 72, 73, 76, 70, 69, 71, 72, 73, 76, 91, 
   93, 94, 73, 95, 92, 91, 93, 94, 73, 95, 92, 93, 94, 73, 97, 92, 
   91, 93, 94, 73, 97, 111, 113, 114, 115, 116, 112, 111, 113, 114, 115, 116, 
   112, 113, 114, 115, 118, 112, 111, 113, 114, 115, 118, 132, 134, 135, 136, 137, 
   133, 132, 134, 135, 136, 137, 133, 134, 135, 136, 139, 133, 132, 134, 135, 136, 
   139, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, "\42", 
"\101\116\104", "\156\165\154\154", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x779a1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[152];
static private final int[] jjstateSet = new int[304];
static protected char curChar;
/** Constructor. */
public HelloTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public HelloTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 152; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
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

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
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

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
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

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
