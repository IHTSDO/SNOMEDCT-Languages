package package.name;

import apg.Grammar;
import java.io.PrintStream;
/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link apg.Generator} class.<br>
 * It is an extension of the {@link apg.Grammar}
 * class containing additional members and enums not found
 * in the base class.<br>
 * The function {@link #getInstance()} will return a reference to a static,
 * singleton instance of the class.
 * <p>For more information visit <a href="http://www.coasttocoastresearch.com" target="_blank">http://www.coasttocoastresearch.com</a>. */

public class ECLparserBrief.java extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new ECLparserBrief.java(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 66;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>17</code>, name = <code>"ancestorOf"</code> */
        ANCESTOROF("ancestorOf", 17, 92, 1),
        /** id = <code>18</code>, name = <code>"ancestorOrSelfOf"</code> */
        ANCESTORORSELFOF("ancestorOrSelfOf", 18, 93, 1),
        /** id = <code>60</code>, name = <code>"anyNonEscapedChar"</code> */
        ANYNONESCAPEDCHAR("anyNonEscapedChar", 60, 329, 10),
        /** id = <code>31</code>, name = <code>"attribute"</code> */
        ATTRIBUTE("attribute", 31, 197, 28),
        /** id = <code>30</code>, name = <code>"attributeGroup"</code> */
        ATTRIBUTEGROUP("attributeGroup", 30, 187, 10),
        /** id = <code>37</code>, name = <code>"attributeName"</code> */
        ATTRIBUTENAME("attributeName", 37, 239, 3),
        /** id = <code>36</code>, name = <code>"attributeOperator"</code> */
        ATTRIBUTEOPERATOR("attributeOperator", 36, 236, 3),
        /** id = <code>26</code>, name = <code>"attributeSet"</code> */
        ATTRIBUTESET("attributeSet", 26, 160, 7),
        /** id = <code>55</code>, name = <code>"BS"</code> */
        BS("BS", 55, 319, 1),
        /** id = <code>32</code>, name = <code>"cardinality"</code> */
        CARDINALITY("cardinality", 32, 225, 8),
        /** id = <code>3</code>, name = <code>"compoundExpressionConstraint"</code> */
        COMPOUNDEXPRESSIONCONSTRAINT("compoundExpressionConstraint", 3, 19, 4),
        /** id = <code>11</code>, name = <code>"conceptId"</code> */
        CONCEPTID("conceptId", 11, 74, 1),
        /** id = <code>10</code>, name = <code>"conceptReference"</code> */
        CONCEPTREFERENCE("conceptReference", 10, 64, 10),
        /** id = <code>19</code>, name = <code>"conjunction"</code> */
        CONJUNCTION("conjunction", 19, 94, 13),
        /** id = <code>27</code>, name = <code>"conjunctionAttributeSet"</code> */
        CONJUNCTIONATTRIBUTESET("conjunctionAttributeSet", 27, 167, 6),
        /** id = <code>4</code>, name = <code>"conjunctionExpressionConstraint"</code> */
        CONJUNCTIONEXPRESSIONCONSTRAINT("conjunctionExpressionConstraint", 4, 23, 8),
        /** id = <code>23</code>, name = <code>"conjunctionRefinementSet"</code> */
        CONJUNCTIONREFINEMENTSET("conjunctionRefinementSet", 23, 139, 6),
        /** id = <code>14</code>, name = <code>"constraintOperator"</code> */
        CONSTRAINTOPERATOR("constraintOperator", 14, 85, 5),
        /** id = <code>52</code>, name = <code>"CR"</code> */
        CR("CR", 52, 316, 1),
        /** id = <code>45</code>, name = <code>"decimalValue"</code> */
        DECIMALVALUE("decimalValue", 45, 287, 5),
        /** id = <code>15</code>, name = <code>"descendantOf"</code> */
        DESCENDANTOF("descendantOf", 15, 90, 1),
        /** id = <code>16</code>, name = <code>"descendantOrSelfOf"</code> */
        DESCENDANTORSELFOF("descendantOrSelfOf", 16, 91, 1),
        /** id = <code>56</code>, name = <code>"digit"</code> */
        DIGIT("digit", 56, 320, 1),
        /** id = <code>58</code>, name = <code>"digitNonZero"</code> */
        DIGITNONZERO("digitNonZero", 58, 322, 1),
        /** id = <code>20</code>, name = <code>"disjunction"</code> */
        DISJUNCTION("disjunction", 20, 107, 8),
        /** id = <code>28</code>, name = <code>"disjunctionAttributeSet"</code> */
        DISJUNCTIONATTRIBUTESET("disjunctionAttributeSet", 28, 173, 6),
        /** id = <code>5</code>, name = <code>"disjunctionExpressionConstraint"</code> */
        DISJUNCTIONEXPRESSIONCONSTRAINT("disjunctionExpressionConstraint", 5, 31, 8),
        /** id = <code>24</code>, name = <code>"disjunctionRefinementSet"</code> */
        DISJUNCTIONREFINEMENTSET("disjunctionRefinementSet", 24, 145, 6),
        /** id = <code>61</code>, name = <code>"escapedChar"</code> */
        ESCAPEDCHAR("escapedChar", 61, 339, 7),
        /** id = <code>21</code>, name = <code>"exclusion"</code> */
        EXCLUSION("exclusion", 21, 115, 17),
        /** id = <code>6</code>, name = <code>"exclusionExpressionConstraint"</code> */
        EXCLUSIONEXPRESSIONCONSTRAINT("exclusionExpressionConstraint", 6, 39, 6),
        /** id = <code>39</code>, name = <code>"expressionComparisonOperator"</code> */
        EXPRESSIONCOMPARISONOPERATOR("expressionComparisonOperator", 39, 252, 3),
        /** id = <code>0</code>, name = <code>"expressionConstraint"</code> */
        EXPRESSIONCONSTRAINT("expressionConstraint", 0, 0, 7),
        /** id = <code>38</code>, name = <code>"expressionConstraintValue"</code> */
        EXPRESSIONCONSTRAINTVALUE("expressionConstraintValue", 38, 242, 10),
        /** id = <code>8</code>, name = <code>"focusConcept"</code> */
        FOCUSCONCEPT("focusConcept", 8, 55, 8),
        /** id = <code>51</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 51, 315, 1),
        /** id = <code>44</code>, name = <code>"integerValue"</code> */
        INTEGERVALUE("integerValue", 44, 277, 10),
        /** id = <code>53</code>, name = <code>"LF"</code> */
        LF("LF", 53, 317, 1),
        /** id = <code>34</code>, name = <code>"many"</code> */
        MANY("many", 34, 234, 1),
        /** id = <code>9</code>, name = <code>"memberOf"</code> */
        MEMBEROF("memberOf", 9, 63, 1),
        /** id = <code>49</code>, name = <code>"mws"</code> */
        MWS("mws", 49, 308, 6),
        /** id = <code>46</code>, name = <code>"nonNegativeIntegerValue"</code> */
        NONNEGATIVEINTEGERVALUE("nonNegativeIntegerValue", 46, 292, 6),
        /** id = <code>59</code>, name = <code>"nonwsNonPipe"</code> */
        NONWSNONPIPE("nonwsNonPipe", 59, 323, 6),
        /** id = <code>40</code>, name = <code>"numericComparisonOperator"</code> */
        NUMERICCOMPARISONOPERATOR("numericComparisonOperator", 40, 255, 7),
        /** id = <code>42</code>, name = <code>"numericValue"</code> */
        NUMERICVALUE("numericValue", 42, 265, 5),
        /** id = <code>54</code>, name = <code>"QM"</code> */
        QM("QM", 54, 318, 1),
        /** id = <code>2</code>, name = <code>"refinedExpressionConstraint"</code> */
        REFINEDEXPRESSIONCONSTRAINT("refinedExpressionConstraint", 2, 13, 6),
        /** id = <code>22</code>, name = <code>"refinement"</code> */
        REFINEMENT("refinement", 22, 132, 7),
        /** id = <code>35</code>, name = <code>"reverseFlag"</code> */
        REVERSEFLAG("reverseFlag", 35, 235, 1),
        /** id = <code>47</code>, name = <code>"sctId"</code> */
        SCTID("sctId", 47, 298, 4),
        /** id = <code>1</code>, name = <code>"simpleExpressionConstraint"</code> */
        SIMPLEEXPRESSIONCONSTRAINT("simpleExpressionConstraint", 1, 7, 6),
        /** id = <code>50</code>, name = <code>"SP"</code> */
        SP("SP", 50, 314, 1),
        /** id = <code>41</code>, name = <code>"stringComparisonOperator"</code> */
        STRINGCOMPARISONOPERATOR("stringComparisonOperator", 41, 262, 3),
        /** id = <code>43</code>, name = <code>"stringValue"</code> */
        STRINGVALUE("stringValue", 43, 270, 7),
        /** id = <code>29</code>, name = <code>"subAttributeSet"</code> */
        SUBATTRIBUTESET("subAttributeSet", 29, 179, 8),
        /** id = <code>7</code>, name = <code>"subExpressionConstraint"</code> */
        SUBEXPRESSIONCONSTRAINT("subExpressionConstraint", 7, 45, 10),
        /** id = <code>25</code>, name = <code>"subRefinement"</code> */
        SUBREFINEMENT("subRefinement", 25, 151, 9),
        /** id = <code>12</code>, name = <code>"term"</code> */
        TERM("term", 12, 75, 9),
        /** id = <code>33</code>, name = <code>"to"</code> */
        TO("to", 33, 233, 1),
        /** id = <code>62</code>, name = <code>"UTF8-2"</code> */
        UTF8_2("UTF8-2", 62, 346, 3),
        /** id = <code>63</code>, name = <code>"UTF8-3"</code> */
        UTF8_3("UTF8-3", 63, 349, 17),
        /** id = <code>64</code>, name = <code>"UTF8-4"</code> */
        UTF8_4("UTF8-4", 64, 366, 15),
        /** id = <code>65</code>, name = <code>"UTF8-tail"</code> */
        UTF8_TAIL("UTF8-tail", 65, 381, 1),
        /** id = <code>13</code>, name = <code>"wildCard"</code> */
        WILDCARD("wildCard", 13, 84, 1),
        /** id = <code>48</code>, name = <code>"ws"</code> */
        WS("ws", 48, 302, 6),
        /** id = <code>57</code>, name = <code>"zero"</code> */
        ZERO("zero", 57, 321, 1);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /** Associates the enum with the original grammar name of the rule it represents.
        * @return the original grammar rule name. */
        public  String ruleName(){return name;}
        /** Associates the enum with an identifier for the grammar rule it represents.
        * @return the rule name identifier. */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the UDT identifiers and names.
     * The enum constants have the same spelling as the UDT names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static ECLparserBrief.java factoryInstance = null;
    private ECLparserBrief.java(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[66];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
    	Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
    	Opcode[] op = new Opcode[382];
        {int[] a = {1,2,6}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(48, 302); // ws
        {int[] a = {3,4,5}; op[2] = getOpcodeAlt(a);}
        op[3] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[4] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[5] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        op[6] = getOpcodeRnm(48, 302); // ws
        {int[] a = {8,12}; op[7] = getOpcodeCat(a);}
        op[8] = getOpcodeRep((char)0, (char)1, 9);
        {int[] a = {10,11}; op[9] = getOpcodeCat(a);}
        op[10] = getOpcodeRnm(14, 85); // constraintOperator
        op[11] = getOpcodeRnm(48, 302); // ws
        op[12] = getOpcodeRnm(8, 55); // focusConcept
        {int[] a = {14,15,16,17,18}; op[13] = getOpcodeCat(a);}
        op[14] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        op[15] = getOpcodeRnm(48, 302); // ws
        {char[] a = {58}; op[16] = getOpcodeTls(a);}
        op[17] = getOpcodeRnm(48, 302); // ws
        op[18] = getOpcodeRnm(22, 132); // refinement
        {int[] a = {20,21,22}; op[19] = getOpcodeAlt(a);}
        op[20] = getOpcodeRnm(4, 23); // conjunctionExpressionConstraint
        op[21] = getOpcodeRnm(5, 31); // disjunctionExpressionConstraint
        op[22] = getOpcodeRnm(6, 39); // exclusionExpressionConstraint
        {int[] a = {24,25}; op[23] = getOpcodeCat(a);}
        op[24] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[25] = getOpcodeRep((char)1, Character.MAX_VALUE, 26);
        {int[] a = {27,28,29,30}; op[26] = getOpcodeCat(a);}
        op[27] = getOpcodeRnm(48, 302); // ws
        op[28] = getOpcodeRnm(19, 94); // conjunction
        op[29] = getOpcodeRnm(48, 302); // ws
        op[30] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        op[32] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[33] = getOpcodeRep((char)1, Character.MAX_VALUE, 34);
        {int[] a = {35,36,37,38}; op[34] = getOpcodeCat(a);}
        op[35] = getOpcodeRnm(48, 302); // ws
        op[36] = getOpcodeRnm(20, 107); // disjunction
        op[37] = getOpcodeRnm(48, 302); // ws
        op[38] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {40,41,42,43,44}; op[39] = getOpcodeCat(a);}
        op[40] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[41] = getOpcodeRnm(48, 302); // ws
        op[42] = getOpcodeRnm(21, 115); // exclusion
        op[43] = getOpcodeRnm(48, 302); // ws
        op[44] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {46,47}; op[45] = getOpcodeAlt(a);}
        op[46] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        {int[] a = {48,49,50,53,54}; op[47] = getOpcodeCat(a);}
        {char[] a = {40}; op[48] = getOpcodeTls(a);}
        op[49] = getOpcodeRnm(48, 302); // ws
        {int[] a = {51,52}; op[50] = getOpcodeAlt(a);}
        op[51] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[52] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[53] = getOpcodeRnm(48, 302); // ws
        {char[] a = {41}; op[54] = getOpcodeTls(a);}
        {int[] a = {56,60}; op[55] = getOpcodeCat(a);}
        op[56] = getOpcodeRep((char)0, (char)1, 57);
        {int[] a = {58,59}; op[57] = getOpcodeCat(a);}
        op[58] = getOpcodeRnm(9, 63); // memberOf
        op[59] = getOpcodeRnm(48, 302); // ws
        {int[] a = {61,62}; op[60] = getOpcodeAlt(a);}
        op[61] = getOpcodeRnm(10, 64); // conceptReference
        op[62] = getOpcodeRnm(13, 84); // wildCard
        {char[] a = {94}; op[63] = getOpcodeTls(a);}
        {int[] a = {65,66}; op[64] = getOpcodeCat(a);}
        op[65] = getOpcodeRnm(11, 74); // conceptId
        op[66] = getOpcodeRep((char)0, (char)1, 67);
        {int[] a = {68,69,70,71,72,73}; op[67] = getOpcodeCat(a);}
        op[68] = getOpcodeRnm(48, 302); // ws
        {char[] a = {124}; op[69] = getOpcodeTls(a);}
        op[70] = getOpcodeRnm(48, 302); // ws
        op[71] = getOpcodeRnm(12, 75); // term
        op[72] = getOpcodeRnm(48, 302); // ws
        {char[] a = {124}; op[73] = getOpcodeTls(a);}
        op[74] = getOpcodeRnm(47, 298); // sctId
        {int[] a = {76,78}; op[75] = getOpcodeCat(a);}
        op[76] = getOpcodeRep((char)1, Character.MAX_VALUE, 77);
        op[77] = getOpcodeRnm(59, 323); // nonwsNonPipe
        op[78] = getOpcodeRep((char)0, Character.MAX_VALUE, 79);
        {int[] a = {80,82}; op[79] = getOpcodeCat(a);}
        op[80] = getOpcodeRep((char)1, Character.MAX_VALUE, 81);
        op[81] = getOpcodeRnm(50, 314); // SP
        op[82] = getOpcodeRep((char)1, Character.MAX_VALUE, 83);
        op[83] = getOpcodeRnm(59, 323); // nonwsNonPipe
        {char[] a = {42}; op[84] = getOpcodeTls(a);}
        {int[] a = {86,87,88,89}; op[85] = getOpcodeAlt(a);}
        op[86] = getOpcodeRnm(16, 91); // descendantOrSelfOf
        op[87] = getOpcodeRnm(15, 90); // descendantOf
        op[88] = getOpcodeRnm(18, 93); // ancestorOrSelfOf
        op[89] = getOpcodeRnm(17, 92); // ancestorOf
        {char[] a = {60}; op[90] = getOpcodeTls(a);}
        {char[] a = {60,60}; op[91] = getOpcodeTls(a);}
        {char[] a = {62}; op[92] = getOpcodeTls(a);}
        {char[] a = {62,62}; op[93] = getOpcodeTls(a);}
        {int[] a = {95,106}; op[94] = getOpcodeAlt(a);}
        {int[] a = {96,99,102,105}; op[95] = getOpcodeCat(a);}
        {int[] a = {97,98}; op[96] = getOpcodeAlt(a);}
        {char[] a = {97}; op[97] = getOpcodeTls(a);}
        {char[] a = {65}; op[98] = getOpcodeTls(a);}
        {int[] a = {100,101}; op[99] = getOpcodeAlt(a);}
        {char[] a = {110}; op[100] = getOpcodeTls(a);}
        {char[] a = {78}; op[101] = getOpcodeTls(a);}
        {int[] a = {103,104}; op[102] = getOpcodeAlt(a);}
        {char[] a = {100}; op[103] = getOpcodeTls(a);}
        {char[] a = {68}; op[104] = getOpcodeTls(a);}
        op[105] = getOpcodeRnm(49, 308); // mws
        {char[] a = {44}; op[106] = getOpcodeTls(a);}
        {int[] a = {108,111,114}; op[107] = getOpcodeCat(a);}
        {int[] a = {109,110}; op[108] = getOpcodeAlt(a);}
        {char[] a = {111}; op[109] = getOpcodeTls(a);}
        {char[] a = {79}; op[110] = getOpcodeTls(a);}
        {int[] a = {112,113}; op[111] = getOpcodeAlt(a);}
        {char[] a = {114}; op[112] = getOpcodeTls(a);}
        {char[] a = {82}; op[113] = getOpcodeTls(a);}
        op[114] = getOpcodeRnm(49, 308); // mws
        {int[] a = {116,119,122,125,128,131}; op[115] = getOpcodeCat(a);}
        {int[] a = {117,118}; op[116] = getOpcodeAlt(a);}
        {char[] a = {109}; op[117] = getOpcodeTls(a);}
        {char[] a = {77}; op[118] = getOpcodeTls(a);}
        {int[] a = {120,121}; op[119] = getOpcodeAlt(a);}
        {char[] a = {105}; op[120] = getOpcodeTls(a);}
        {char[] a = {73}; op[121] = getOpcodeTls(a);}
        {int[] a = {123,124}; op[122] = getOpcodeAlt(a);}
        {char[] a = {110}; op[123] = getOpcodeTls(a);}
        {char[] a = {78}; op[124] = getOpcodeTls(a);}
        {int[] a = {126,127}; op[125] = getOpcodeAlt(a);}
        {char[] a = {117}; op[126] = getOpcodeTls(a);}
        {char[] a = {85}; op[127] = getOpcodeTls(a);}
        {int[] a = {129,130}; op[128] = getOpcodeAlt(a);}
        {char[] a = {115}; op[129] = getOpcodeTls(a);}
        {char[] a = {83}; op[130] = getOpcodeTls(a);}
        op[131] = getOpcodeRnm(49, 308); // mws
        {int[] a = {133,134,135}; op[132] = getOpcodeCat(a);}
        op[133] = getOpcodeRnm(25, 151); // subRefinement
        op[134] = getOpcodeRnm(48, 302); // ws
        op[135] = getOpcodeRep((char)0, (char)1, 136);
        {int[] a = {137,138}; op[136] = getOpcodeAlt(a);}
        op[137] = getOpcodeRnm(23, 139); // conjunctionRefinementSet
        op[138] = getOpcodeRnm(24, 145); // disjunctionRefinementSet
        op[139] = getOpcodeRep((char)1, Character.MAX_VALUE, 140);
        {int[] a = {141,142,143,144}; op[140] = getOpcodeCat(a);}
        op[141] = getOpcodeRnm(48, 302); // ws
        op[142] = getOpcodeRnm(19, 94); // conjunction
        op[143] = getOpcodeRnm(48, 302); // ws
        op[144] = getOpcodeRnm(25, 151); // subRefinement
        op[145] = getOpcodeRep((char)1, Character.MAX_VALUE, 146);
        {int[] a = {147,148,149,150}; op[146] = getOpcodeCat(a);}
        op[147] = getOpcodeRnm(48, 302); // ws
        op[148] = getOpcodeRnm(20, 107); // disjunction
        op[149] = getOpcodeRnm(48, 302); // ws
        op[150] = getOpcodeRnm(25, 151); // subRefinement
        {int[] a = {152,153,154}; op[151] = getOpcodeAlt(a);}
        op[152] = getOpcodeRnm(26, 160); // attributeSet
        op[153] = getOpcodeRnm(30, 187); // attributeGroup
        {int[] a = {155,156,157,158,159}; op[154] = getOpcodeCat(a);}
        {char[] a = {40}; op[155] = getOpcodeTls(a);}
        op[156] = getOpcodeRnm(48, 302); // ws
        op[157] = getOpcodeRnm(22, 132); // refinement
        op[158] = getOpcodeRnm(48, 302); // ws
        {char[] a = {41}; op[159] = getOpcodeTls(a);}
        {int[] a = {161,162,163}; op[160] = getOpcodeCat(a);}
        op[161] = getOpcodeRnm(29, 179); // subAttributeSet
        op[162] = getOpcodeRnm(48, 302); // ws
        op[163] = getOpcodeRep((char)0, (char)1, 164);
        {int[] a = {165,166}; op[164] = getOpcodeAlt(a);}
        op[165] = getOpcodeRnm(27, 167); // conjunctionAttributeSet
        op[166] = getOpcodeRnm(28, 173); // disjunctionAttributeSet
        op[167] = getOpcodeRep((char)1, Character.MAX_VALUE, 168);
        {int[] a = {169,170,171,172}; op[168] = getOpcodeCat(a);}
        op[169] = getOpcodeRnm(48, 302); // ws
        op[170] = getOpcodeRnm(19, 94); // conjunction
        op[171] = getOpcodeRnm(48, 302); // ws
        op[172] = getOpcodeRnm(29, 179); // subAttributeSet
        op[173] = getOpcodeRep((char)1, Character.MAX_VALUE, 174);
        {int[] a = {175,176,177,178}; op[174] = getOpcodeCat(a);}
        op[175] = getOpcodeRnm(48, 302); // ws
        op[176] = getOpcodeRnm(20, 107); // disjunction
        op[177] = getOpcodeRnm(48, 302); // ws
        op[178] = getOpcodeRnm(29, 179); // subAttributeSet
        {int[] a = {180,181}; op[179] = getOpcodeAlt(a);}
        op[180] = getOpcodeRnm(31, 197); // attribute
        {int[] a = {182,183,184,185,186}; op[181] = getOpcodeCat(a);}
        {char[] a = {40}; op[182] = getOpcodeTls(a);}
        op[183] = getOpcodeRnm(48, 302); // ws
        op[184] = getOpcodeRnm(26, 160); // attributeSet
        op[185] = getOpcodeRnm(48, 302); // ws
        {char[] a = {41}; op[186] = getOpcodeTls(a);}
        {int[] a = {188,192,193,194,195,196}; op[187] = getOpcodeCat(a);}
        op[188] = getOpcodeRep((char)0, (char)1, 189);
        {int[] a = {190,191}; op[189] = getOpcodeCat(a);}
        op[190] = getOpcodeRnm(32, 225); // cardinality
        op[191] = getOpcodeRnm(48, 302); // ws
        {char[] a = {123}; op[192] = getOpcodeTls(a);}
        op[193] = getOpcodeRnm(48, 302); // ws
        op[194] = getOpcodeRnm(26, 160); // attributeSet
        op[195] = getOpcodeRnm(48, 302); // ws
        {char[] a = {125}; op[196] = getOpcodeTls(a);}
        {int[] a = {198,202,206,210,211,212}; op[197] = getOpcodeCat(a);}
        op[198] = getOpcodeRep((char)0, (char)1, 199);
        {int[] a = {200,201}; op[199] = getOpcodeCat(a);}
        op[200] = getOpcodeRnm(32, 225); // cardinality
        op[201] = getOpcodeRnm(48, 302); // ws
        op[202] = getOpcodeRep((char)0, (char)1, 203);
        {int[] a = {204,205}; op[203] = getOpcodeCat(a);}
        op[204] = getOpcodeRnm(35, 235); // reverseFlag
        op[205] = getOpcodeRnm(48, 302); // ws
        op[206] = getOpcodeRep((char)0, (char)1, 207);
        {int[] a = {208,209}; op[207] = getOpcodeCat(a);}
        op[208] = getOpcodeRnm(36, 236); // attributeOperator
        op[209] = getOpcodeRnm(48, 302); // ws
        op[210] = getOpcodeRnm(37, 239); // attributeName
        op[211] = getOpcodeRnm(48, 302); // ws
        {int[] a = {213,217,221}; op[212] = getOpcodeAlt(a);}
        {int[] a = {214,215,216}; op[213] = getOpcodeCat(a);}
        op[214] = getOpcodeRnm(39, 252); // expressionComparisonOperator
        op[215] = getOpcodeRnm(48, 302); // ws
        op[216] = getOpcodeRnm(38, 242); // expressionConstraintValue
        {int[] a = {218,219,220}; op[217] = getOpcodeCat(a);}
        op[218] = getOpcodeRnm(40, 255); // numericComparisonOperator
        op[219] = getOpcodeRnm(48, 302); // ws
        op[220] = getOpcodeRnm(42, 265); // numericValue
        {int[] a = {222,223,224}; op[221] = getOpcodeCat(a);}
        op[222] = getOpcodeRnm(41, 262); // stringComparisonOperator
        op[223] = getOpcodeRnm(48, 302); // ws
        op[224] = getOpcodeRnm(43, 270); // stringValue
        {int[] a = {226,227,228,229,232}; op[225] = getOpcodeCat(a);}
        {char[] a = {91}; op[226] = getOpcodeTls(a);}
        op[227] = getOpcodeRnm(46, 292); // nonNegativeIntegerValue
        op[228] = getOpcodeRnm(33, 233); // to
        {int[] a = {230,231}; op[229] = getOpcodeAlt(a);}
        op[230] = getOpcodeRnm(46, 292); // nonNegativeIntegerValue
        op[231] = getOpcodeRnm(34, 234); // many
        {char[] a = {93}; op[232] = getOpcodeTls(a);}
        {char[] a = {46,46}; op[233] = getOpcodeTls(a);}
        {char[] a = {42}; op[234] = getOpcodeTls(a);}
        {char[] a = {82}; op[235] = getOpcodeTls(a);}
        {int[] a = {237,238}; op[236] = getOpcodeAlt(a);}
        op[237] = getOpcodeRnm(16, 91); // descendantOrSelfOf
        op[238] = getOpcodeRnm(15, 90); // descendantOf
        {int[] a = {240,241}; op[239] = getOpcodeAlt(a);}
        op[240] = getOpcodeRnm(10, 64); // conceptReference
        op[241] = getOpcodeRnm(13, 84); // wildCard
        {int[] a = {243,244}; op[242] = getOpcodeAlt(a);}
        op[243] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        {int[] a = {245,246,247,250,251}; op[244] = getOpcodeCat(a);}
        {char[] a = {40}; op[245] = getOpcodeTls(a);}
        op[246] = getOpcodeRnm(48, 302); // ws
        {int[] a = {248,249}; op[247] = getOpcodeAlt(a);}
        op[248] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[249] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[250] = getOpcodeRnm(48, 302); // ws
        {char[] a = {41}; op[251] = getOpcodeTls(a);}
        {int[] a = {253,254}; op[252] = getOpcodeAlt(a);}
        {char[] a = {61}; op[253] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[254] = getOpcodeTls(a);}
        {int[] a = {256,257,258,259,260,261}; op[255] = getOpcodeAlt(a);}
        {char[] a = {61}; op[256] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[257] = getOpcodeTls(a);}
        {char[] a = {60,61}; op[258] = getOpcodeTls(a);}
        {char[] a = {60}; op[259] = getOpcodeTls(a);}
        {char[] a = {62,61}; op[260] = getOpcodeTls(a);}
        {char[] a = {62}; op[261] = getOpcodeTls(a);}
        {int[] a = {263,264}; op[262] = getOpcodeAlt(a);}
        {char[] a = {61}; op[263] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[264] = getOpcodeTls(a);}
        {int[] a = {266,267}; op[265] = getOpcodeCat(a);}
        {char[] a = {35}; op[266] = getOpcodeTls(a);}
        {int[] a = {268,269}; op[267] = getOpcodeAlt(a);}
        op[268] = getOpcodeRnm(45, 287); // decimalValue
        op[269] = getOpcodeRnm(44, 277); // integerValue
        {int[] a = {271,272,276}; op[270] = getOpcodeCat(a);}
        op[271] = getOpcodeRnm(54, 318); // QM
        op[272] = getOpcodeRep((char)1, Character.MAX_VALUE, 273);
        {int[] a = {274,275}; op[273] = getOpcodeAlt(a);}
        op[274] = getOpcodeRnm(60, 329); // anyNonEscapedChar
        op[275] = getOpcodeRnm(61, 339); // escapedChar
        op[276] = getOpcodeRnm(54, 318); // QM
        {int[] a = {278,286}; op[277] = getOpcodeAlt(a);}
        {int[] a = {279,283,284}; op[278] = getOpcodeCat(a);}
        op[279] = getOpcodeRep((char)0, (char)1, 280);
        {int[] a = {281,282}; op[280] = getOpcodeAlt(a);}
        {char[] a = {45}; op[281] = getOpcodeTls(a);}
        {char[] a = {43}; op[282] = getOpcodeTls(a);}
        op[283] = getOpcodeRnm(58, 322); // digitNonZero
        op[284] = getOpcodeRep((char)0, Character.MAX_VALUE, 285);
        op[285] = getOpcodeRnm(56, 320); // digit
        op[286] = getOpcodeRnm(57, 321); // zero
        {int[] a = {288,289,290}; op[287] = getOpcodeCat(a);}
        op[288] = getOpcodeRnm(44, 277); // integerValue
        {char[] a = {46}; op[289] = getOpcodeTls(a);}
        op[290] = getOpcodeRep((char)1, Character.MAX_VALUE, 291);
        op[291] = getOpcodeRnm(56, 320); // digit
        {int[] a = {293,297}; op[292] = getOpcodeAlt(a);}
        {int[] a = {294,295}; op[293] = getOpcodeCat(a);}
        op[294] = getOpcodeRnm(58, 322); // digitNonZero
        op[295] = getOpcodeRep((char)0, Character.MAX_VALUE, 296);
        op[296] = getOpcodeRnm(56, 320); // digit
        op[297] = getOpcodeRnm(57, 321); // zero
        {int[] a = {299,300}; op[298] = getOpcodeCat(a);}
        op[299] = getOpcodeRnm(58, 322); // digitNonZero
        op[300] = getOpcodeRep((char)5, (char)17, 301);
        op[301] = getOpcodeRnm(56, 320); // digit
        op[302] = getOpcodeRep((char)0, Character.MAX_VALUE, 303);
        {int[] a = {304,305,306,307}; op[303] = getOpcodeAlt(a);}
        op[304] = getOpcodeRnm(50, 314); // SP
        op[305] = getOpcodeRnm(51, 315); // HTAB
        op[306] = getOpcodeRnm(52, 316); // CR
        op[307] = getOpcodeRnm(53, 317); // LF
        op[308] = getOpcodeRep((char)1, Character.MAX_VALUE, 309);
        {int[] a = {310,311,312,313}; op[309] = getOpcodeAlt(a);}
        op[310] = getOpcodeRnm(50, 314); // SP
        op[311] = getOpcodeRnm(51, 315); // HTAB
        op[312] = getOpcodeRnm(52, 316); // CR
        op[313] = getOpcodeRnm(53, 317); // LF
        {char[] a = {32}; op[314] = getOpcodeTbs(a);}
        {char[] a = {9}; op[315] = getOpcodeTbs(a);}
        {char[] a = {13}; op[316] = getOpcodeTbs(a);}
        {char[] a = {10}; op[317] = getOpcodeTbs(a);}
        {char[] a = {34}; op[318] = getOpcodeTbs(a);}
        {char[] a = {92}; op[319] = getOpcodeTbs(a);}
        op[320] = getOpcodeTrg((char)48, (char)57);
        {char[] a = {48}; op[321] = getOpcodeTbs(a);}
        op[322] = getOpcodeTrg((char)49, (char)57);
        {int[] a = {324,325,326,327,328}; op[323] = getOpcodeAlt(a);}
        op[324] = getOpcodeTrg((char)33, (char)123);
        op[325] = getOpcodeTrg((char)125, (char)126);
        op[326] = getOpcodeRnm(62, 346); // UTF8-2
        op[327] = getOpcodeRnm(63, 349); // UTF8-3
        op[328] = getOpcodeRnm(64, 366); // UTF8-4
        {int[] a = {330,331,332,333,334,335,336,337,338}; op[329] = getOpcodeAlt(a);}
        op[330] = getOpcodeRnm(51, 315); // HTAB
        op[331] = getOpcodeRnm(52, 316); // CR
        op[332] = getOpcodeRnm(53, 317); // LF
        op[333] = getOpcodeTrg((char)32, (char)33);
        op[334] = getOpcodeTrg((char)35, (char)91);
        op[335] = getOpcodeTrg((char)93, (char)126);
        op[336] = getOpcodeRnm(62, 346); // UTF8-2
        op[337] = getOpcodeRnm(63, 349); // UTF8-3
        op[338] = getOpcodeRnm(64, 366); // UTF8-4
        {int[] a = {340,343}; op[339] = getOpcodeAlt(a);}
        {int[] a = {341,342}; op[340] = getOpcodeCat(a);}
        op[341] = getOpcodeRnm(55, 319); // BS
        op[342] = getOpcodeRnm(54, 318); // QM
        {int[] a = {344,345}; op[343] = getOpcodeCat(a);}
        op[344] = getOpcodeRnm(55, 319); // BS
        op[345] = getOpcodeRnm(55, 319); // BS
        {int[] a = {347,348}; op[346] = getOpcodeCat(a);}
        op[347] = getOpcodeTrg((char)194, (char)223);
        op[348] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {350,354,358,362}; op[349] = getOpcodeAlt(a);}
        {int[] a = {351,352,353}; op[350] = getOpcodeCat(a);}
        {char[] a = {224}; op[351] = getOpcodeTbs(a);}
        op[352] = getOpcodeTrg((char)160, (char)191);
        op[353] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {355,356}; op[354] = getOpcodeCat(a);}
        op[355] = getOpcodeTrg((char)225, (char)236);
        op[356] = getOpcodeRep((char)2, (char)2, 357);
        op[357] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {359,360,361}; op[358] = getOpcodeCat(a);}
        {char[] a = {237}; op[359] = getOpcodeTbs(a);}
        op[360] = getOpcodeTrg((char)128, (char)159);
        op[361] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {363,364}; op[362] = getOpcodeCat(a);}
        op[363] = getOpcodeTrg((char)238, (char)239);
        op[364] = getOpcodeRep((char)2, (char)2, 365);
        op[365] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {367,372,376}; op[366] = getOpcodeAlt(a);}
        {int[] a = {368,369,370}; op[367] = getOpcodeCat(a);}
        {char[] a = {240}; op[368] = getOpcodeTbs(a);}
        op[369] = getOpcodeTrg((char)144, (char)191);
        op[370] = getOpcodeRep((char)2, (char)2, 371);
        op[371] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {373,374}; op[372] = getOpcodeCat(a);}
        op[373] = getOpcodeTrg((char)241, (char)243);
        op[374] = getOpcodeRep((char)3, (char)3, 375);
        op[375] = getOpcodeRnm(65, 381); // UTF8-tail
        {int[] a = {377,378,379}; op[376] = getOpcodeCat(a);}
        {char[] a = {244}; op[377] = getOpcodeTbs(a);}
        op[378] = getOpcodeTrg((char)128, (char)143);
        op[379] = getOpcodeRep((char)2, (char)2, 380);
        op[380] = getOpcodeRnm(65, 381); // UTF8-tail
        op[381] = getOpcodeTrg((char)128, (char)191);
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; package.name.ECLparserBrief.java");
        out.println(";");
        out.println("expressionConstraint = ws ( refinedExpressionConstraint / compoundExpressionConstraint / simpleExpressionConstraint ) ws");
        out.println("simpleExpressionConstraint =  [constraintOperator ws] focusConcept ");
        out.println("refinedExpressionConstraint = simpleExpressionConstraint  ws \":\" ws refinement");
        out.println("compoundExpressionConstraint = conjunctionExpressionConstraint / disjunctionExpressionConstraint / exclusionExpressionConstraint");
        out.println("conjunctionExpressionConstraint = subExpressionConstraint 1*(ws conjunction ws subExpressionConstraint)");
        out.println("disjunctionExpressionConstraint = subExpressionConstraint 1*(ws disjunction ws subExpressionConstraint)");
        out.println("exclusionExpressionConstraint = subExpressionConstraint ws exclusion ws subExpressionConstraint");
        out.println("subExpressionConstraint = simpleExpressionConstraint / 	\"(\" ws (compoundExpressionConstraint / refinedExpressionConstraint) ws \")\"");
        out.println("focusConcept = [ memberOf ws ] (conceptReference / wildCard) ");
        out.println("memberOf = \"^\"");
        out.println("conceptReference = conceptId [ws \"|\" ws term ws \"|\"]");
        out.println("conceptId = sctId");
        out.println("term = 1*nonwsNonPipe *( 1*SP 1*nonwsNonPipe )");
        out.println("wildCard = \"*\"");
        out.println("constraintOperator = descendantOrSelfOf / descendantOf /  ancestorOrSelfOf / ancestorOf");
        out.println("descendantOf = \"<\"");
        out.println("descendantOrSelfOf = \"<<\" ");
        out.println("ancestorOf = \">\" ");
        out.println("ancestorOrSelfOf = \">>\" ");
        out.println("conjunction = ((\"a\"/\"A\") (\"n\"/\"N\") (\"d\"/\"D\") mws) / \",\"");
        out.println("disjunction = (\"o\"/\"O\") (\"r\"/\"R\") mws");
        out.println("exclusion = (\"m\"/\"M\") (\"i\"/\"I\") (\"n\"/\"N\") (\"u\"/\"U\") (\"s\"/\"S\") mws	");
        out.println("refinement = subRefinement ws [conjunctionRefinementSet / disjunctionRefinementSet]");
        out.println("conjunctionRefinementSet = 1*(ws conjunction ws subRefinement)");
        out.println("disjunctionRefinementSet = 1*(ws disjunction ws subRefinement)");
        out.println("subRefinement = attributeSet / attributeGroup / \"(\" ws refinement ws \")\"");
        out.println("attributeSet = subAttributeSet ws [conjunctionAttributeSet / disjunctionAttributeSet]");
        out.println("conjunctionAttributeSet = 1*(ws conjunction ws subAttributeSet)");
        out.println("disjunctionAttributeSet = 1*(ws disjunction ws subAttributeSet)");
        out.println("subAttributeSet = attribute / \"(\" ws attributeSet ws \")\"");
        out.println("attributeGroup = [cardinality ws] \"{\" ws attributeSet ws \"}\"");
        out.println("attribute = [cardinality ws] [reverseFlag ws] [attributeOperator ws] attributeName ws (expressionComparisonOperator ws expressionConstraintValue / numericComparisonOperator ws numericValue / stringComparisonOperator ws stringValue )");
        out.println("cardinality = \"[\" nonNegativeIntegerValue to (nonNegativeIntegerValue / many) \"]\" ");
        out.println("to = \"..\"");
        out.println("many = \"*\"");
        out.println("reverseFlag =  \"R\"");
        out.println("attributeOperator = descendantOrSelfOf / descendantOf ");
        out.println("attributeName = conceptReference / wildCard");
        out.println("expressionConstraintValue = simpleExpressionConstraint / \"(\" ws (refinedExpressionConstraint / compoundExpressionConstraint) ws \")\"");
        out.println("expressionComparisonOperator = \"=\" / \"!=\" ");
        out.println("numericComparisonOperator = \"=\" / \"!=\" / \"<=\" / \"<\" / \">=\" / \">\"");
        out.println("stringComparisonOperator = \"=\" / \"!=\" ");
        out.println("numericValue =  \"#\" ( decimalValue / integerValue)");
        out.println("stringValue =  QM 1*(anyNonEscapedChar / escapedChar) QM ");
        out.println("integerValue = ( [\"-\"/\"+\"] digitNonZero *digit ) / zero");
        out.println("decimalValue = integerValue \".\" 1*digit");
        out.println("nonNegativeIntegerValue = (digitNonZero *digit ) / zero");
        out.println("sctId = digitNonZero 5*17( digit )");
        out.println("ws = *( SP / HTAB / CR / LF )  ; optional white space");
        out.println("mws = 1*( SP / HTAB / CR / LF )  ; mandatory white space");
        out.println("SP = %x20  ; space");
        out.println("HTAB = %x09  ; tab");
        out.println("CR = %x0D  ; carriage return");
        out.println("LF = %x0A  ; line feed");
        out.println("QM = %x22 ; quotation mark");
        out.println("BS = %x5C  ; back slash");
        out.println("digit = %x30-39");
        out.println("zero = %x30");
        out.println("digitNonZero = %x31-39 ");
        out.println("nonwsNonPipe = %x21-7B / %x7D-7E / UTF8-2 / UTF8-3 / UTF8-4");
        out.println("anyNonEscapedChar = HTAB / CR / LF / %x20-21 / %x23-5B / %x5D-7E / UTF8-2 / UTF8-3 / UTF8-4");
        out.println("escapedChar = BS QM / BS BS");
        out.println("UTF8-2 = %xC2-DF UTF8-tail");
        out.println("UTF8-3 = %xE0 %xA0-BF UTF8-tail / %xE1-EC 2( UTF8-tail ) / %xED %x80-9F UTF8-tail / %xEE-EF 2( UTF8-tail )");
        out.println("UTF8-4 = %xF0 %x90-BF 2( UTF8-tail ) / %xF1-F3 3( UTF8-tail ) / %xF4 %x80-8F 2( UTF8-tail )");
        out.println("UTF8-tail = %x80-BF");
    }
}
