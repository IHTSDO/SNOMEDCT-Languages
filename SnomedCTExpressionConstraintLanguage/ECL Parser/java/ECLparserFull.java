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

public class ECLparserFull.java extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new ECLparserFull.java(getRules(), getUdts(), getOpcodes());
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
        ANCESTOROF("ancestorOf", 17, 225, 34),
        /** id = <code>18</code>, name = <code>"ancestorOrSelfOf"</code> */
        ANCESTORORSELFOF("ancestorOrSelfOf", 18, 259, 52),
        /** id = <code>60</code>, name = <code>"anyNonEscapedChar"</code> */
        ANYNONESCAPEDCHAR("anyNonEscapedChar", 60, 638, 10),
        /** id = <code>31</code>, name = <code>"attribute"</code> */
        ATTRIBUTE("attribute", 31, 414, 28),
        /** id = <code>30</code>, name = <code>"attributeGroup"</code> */
        ATTRIBUTEGROUP("attributeGroup", 30, 404, 10),
        /** id = <code>37</code>, name = <code>"attributeName"</code> */
        ATTRIBUTENAME("attributeName", 37, 509, 3),
        /** id = <code>36</code>, name = <code>"attributeOperator"</code> */
        ATTRIBUTEOPERATOR("attributeOperator", 36, 506, 3),
        /** id = <code>26</code>, name = <code>"attributeSet"</code> */
        ATTRIBUTESET("attributeSet", 26, 377, 7),
        /** id = <code>55</code>, name = <code>"BS"</code> */
        BS("BS", 55, 628, 1),
        /** id = <code>32</code>, name = <code>"cardinality"</code> */
        CARDINALITY("cardinality", 32, 442, 8),
        /** id = <code>3</code>, name = <code>"compoundExpressionConstraint"</code> */
        COMPOUNDEXPRESSIONCONSTRAINT("compoundExpressionConstraint", 3, 19, 4),
        /** id = <code>11</code>, name = <code>"conceptId"</code> */
        CONCEPTID("conceptId", 11, 100, 1),
        /** id = <code>10</code>, name = <code>"conceptReference"</code> */
        CONCEPTREFERENCE("conceptReference", 10, 90, 10),
        /** id = <code>19</code>, name = <code>"conjunction"</code> */
        CONJUNCTION("conjunction", 19, 311, 13),
        /** id = <code>27</code>, name = <code>"conjunctionAttributeSet"</code> */
        CONJUNCTIONATTRIBUTESET("conjunctionAttributeSet", 27, 384, 6),
        /** id = <code>4</code>, name = <code>"conjunctionExpressionConstraint"</code> */
        CONJUNCTIONEXPRESSIONCONSTRAINT("conjunctionExpressionConstraint", 4, 23, 8),
        /** id = <code>23</code>, name = <code>"conjunctionRefinementSet"</code> */
        CONJUNCTIONREFINEMENTSET("conjunctionRefinementSet", 23, 356, 6),
        /** id = <code>14</code>, name = <code>"constraintOperator"</code> */
        CONSTRAINTOPERATOR("constraintOperator", 14, 122, 5),
        /** id = <code>52</code>, name = <code>"CR"</code> */
        CR("CR", 52, 625, 1),
        /** id = <code>45</code>, name = <code>"decimalValue"</code> */
        DECIMALVALUE("decimalValue", 45, 596, 5),
        /** id = <code>15</code>, name = <code>"descendantOf"</code> */
        DESCENDANTOF("descendantOf", 15, 127, 40),
        /** id = <code>16</code>, name = <code>"descendantOrSelfOf"</code> */
        DESCENDANTORSELFOF("descendantOrSelfOf", 16, 167, 58),
        /** id = <code>56</code>, name = <code>"digit"</code> */
        DIGIT("digit", 56, 629, 1),
        /** id = <code>58</code>, name = <code>"digitNonZero"</code> */
        DIGITNONZERO("digitNonZero", 58, 631, 1),
        /** id = <code>20</code>, name = <code>"disjunction"</code> */
        DISJUNCTION("disjunction", 20, 324, 8),
        /** id = <code>28</code>, name = <code>"disjunctionAttributeSet"</code> */
        DISJUNCTIONATTRIBUTESET("disjunctionAttributeSet", 28, 390, 6),
        /** id = <code>5</code>, name = <code>"disjunctionExpressionConstraint"</code> */
        DISJUNCTIONEXPRESSIONCONSTRAINT("disjunctionExpressionConstraint", 5, 31, 8),
        /** id = <code>24</code>, name = <code>"disjunctionRefinementSet"</code> */
        DISJUNCTIONREFINEMENTSET("disjunctionRefinementSet", 24, 362, 6),
        /** id = <code>61</code>, name = <code>"escapedChar"</code> */
        ESCAPEDCHAR("escapedChar", 61, 648, 7),
        /** id = <code>21</code>, name = <code>"exclusion"</code> */
        EXCLUSION("exclusion", 21, 332, 17),
        /** id = <code>6</code>, name = <code>"exclusionExpressionConstraint"</code> */
        EXCLUSIONEXPRESSIONCONSTRAINT("exclusionExpressionConstraint", 6, 39, 6),
        /** id = <code>39</code>, name = <code>"expressionComparisonOperator"</code> */
        EXPRESSIONCOMPARISONOPERATOR("expressionComparisonOperator", 39, 522, 16),
        /** id = <code>0</code>, name = <code>"expressionConstraint"</code> */
        EXPRESSIONCONSTRAINT("expressionConstraint", 0, 0, 7),
        /** id = <code>38</code>, name = <code>"expressionConstraintValue"</code> */
        EXPRESSIONCONSTRAINTVALUE("expressionConstraintValue", 38, 512, 10),
        /** id = <code>8</code>, name = <code>"focusConcept"</code> */
        FOCUSCONCEPT("focusConcept", 8, 55, 8),
        /** id = <code>51</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 51, 624, 1),
        /** id = <code>44</code>, name = <code>"integerValue"</code> */
        INTEGERVALUE("integerValue", 44, 586, 10),
        /** id = <code>53</code>, name = <code>"LF"</code> */
        LF("LF", 53, 626, 1),
        /** id = <code>34</code>, name = <code>"many"</code> */
        MANY("many", 34, 461, 15),
        /** id = <code>9</code>, name = <code>"memberOf"</code> */
        MEMBEROF("memberOf", 9, 63, 27),
        /** id = <code>49</code>, name = <code>"mws"</code> */
        MWS("mws", 49, 617, 6),
        /** id = <code>46</code>, name = <code>"nonNegativeIntegerValue"</code> */
        NONNEGATIVEINTEGERVALUE("nonNegativeIntegerValue", 46, 601, 6),
        /** id = <code>59</code>, name = <code>"nonwsNonPipe"</code> */
        NONWSNONPIPE("nonwsNonPipe", 59, 632, 6),
        /** id = <code>40</code>, name = <code>"numericComparisonOperator"</code> */
        NUMERICCOMPARISONOPERATOR("numericComparisonOperator", 40, 538, 20),
        /** id = <code>42</code>, name = <code>"numericValue"</code> */
        NUMERICVALUE("numericValue", 42, 574, 5),
        /** id = <code>54</code>, name = <code>"QM"</code> */
        QM("QM", 54, 627, 1),
        /** id = <code>2</code>, name = <code>"refinedExpressionConstraint"</code> */
        REFINEDEXPRESSIONCONSTRAINT("refinedExpressionConstraint", 2, 13, 6),
        /** id = <code>22</code>, name = <code>"refinement"</code> */
        REFINEMENT("refinement", 22, 349, 7),
        /** id = <code>35</code>, name = <code>"reverseFlag"</code> */
        REVERSEFLAG("reverseFlag", 35, 476, 30),
        /** id = <code>47</code>, name = <code>"sctId"</code> */
        SCTID("sctId", 47, 607, 4),
        /** id = <code>1</code>, name = <code>"simpleExpressionConstraint"</code> */
        SIMPLEEXPRESSIONCONSTRAINT("simpleExpressionConstraint", 1, 7, 6),
        /** id = <code>50</code>, name = <code>"SP"</code> */
        SP("SP", 50, 623, 1),
        /** id = <code>41</code>, name = <code>"stringComparisonOperator"</code> */
        STRINGCOMPARISONOPERATOR("stringComparisonOperator", 41, 558, 16),
        /** id = <code>43</code>, name = <code>"stringValue"</code> */
        STRINGVALUE("stringValue", 43, 579, 7),
        /** id = <code>29</code>, name = <code>"subAttributeSet"</code> */
        SUBATTRIBUTESET("subAttributeSet", 29, 396, 8),
        /** id = <code>7</code>, name = <code>"subExpressionConstraint"</code> */
        SUBEXPRESSIONCONSTRAINT("subExpressionConstraint", 7, 45, 10),
        /** id = <code>25</code>, name = <code>"subRefinement"</code> */
        SUBREFINEMENT("subRefinement", 25, 368, 9),
        /** id = <code>13</code>, name = <code>"term"</code> */
        TERM("term", 13, 113, 9),
        /** id = <code>33</code>, name = <code>"to"</code> */
        TO("to", 33, 450, 11),
        /** id = <code>62</code>, name = <code>"UTF8-2"</code> */
        UTF8_2("UTF8-2", 62, 655, 3),
        /** id = <code>63</code>, name = <code>"UTF8-3"</code> */
        UTF8_3("UTF8-3", 63, 658, 17),
        /** id = <code>64</code>, name = <code>"UTF8-4"</code> */
        UTF8_4("UTF8-4", 64, 675, 15),
        /** id = <code>65</code>, name = <code>"UTF8-tail"</code> */
        UTF8_TAIL("UTF8-tail", 65, 690, 1),
        /** id = <code>12</code>, name = <code>"wildCard"</code> */
        WILDCARD("wildCard", 12, 101, 12),
        /** id = <code>48</code>, name = <code>"ws"</code> */
        WS("ws", 48, 611, 6),
        /** id = <code>57</code>, name = <code>"zero"</code> */
        ZERO("zero", 57, 630, 1);
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
    private static ECLparserFull.java factoryInstance = null;
    private ECLparserFull.java(Rule[] rules, Udt[] udts, Opcode[] opcodes){
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
    	Opcode[] op = new Opcode[691];
        {int[] a = {1,2,6}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(48, 611); // ws
        {int[] a = {3,4,5}; op[2] = getOpcodeAlt(a);}
        op[3] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[4] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[5] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        op[6] = getOpcodeRnm(48, 611); // ws
        {int[] a = {8,12}; op[7] = getOpcodeCat(a);}
        op[8] = getOpcodeRep((char)0, (char)1, 9);
        {int[] a = {10,11}; op[9] = getOpcodeCat(a);}
        op[10] = getOpcodeRnm(14, 122); // constraintOperator
        op[11] = getOpcodeRnm(48, 611); // ws
        op[12] = getOpcodeRnm(8, 55); // focusConcept
        {int[] a = {14,15,16,17,18}; op[13] = getOpcodeCat(a);}
        op[14] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        op[15] = getOpcodeRnm(48, 611); // ws
        {char[] a = {58}; op[16] = getOpcodeTls(a);}
        op[17] = getOpcodeRnm(48, 611); // ws
        op[18] = getOpcodeRnm(22, 349); // refinement
        {int[] a = {20,21,22}; op[19] = getOpcodeAlt(a);}
        op[20] = getOpcodeRnm(4, 23); // conjunctionExpressionConstraint
        op[21] = getOpcodeRnm(5, 31); // disjunctionExpressionConstraint
        op[22] = getOpcodeRnm(6, 39); // exclusionExpressionConstraint
        {int[] a = {24,25}; op[23] = getOpcodeCat(a);}
        op[24] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[25] = getOpcodeRep((char)1, Character.MAX_VALUE, 26);
        {int[] a = {27,28,29,30}; op[26] = getOpcodeCat(a);}
        op[27] = getOpcodeRnm(48, 611); // ws
        op[28] = getOpcodeRnm(19, 311); // conjunction
        op[29] = getOpcodeRnm(48, 611); // ws
        op[30] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        op[32] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[33] = getOpcodeRep((char)1, Character.MAX_VALUE, 34);
        {int[] a = {35,36,37,38}; op[34] = getOpcodeCat(a);}
        op[35] = getOpcodeRnm(48, 611); // ws
        op[36] = getOpcodeRnm(20, 324); // disjunction
        op[37] = getOpcodeRnm(48, 611); // ws
        op[38] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {40,41,42,43,44}; op[39] = getOpcodeCat(a);}
        op[40] = getOpcodeRnm(7, 45); // subExpressionConstraint
        op[41] = getOpcodeRnm(48, 611); // ws
        op[42] = getOpcodeRnm(21, 332); // exclusion
        op[43] = getOpcodeRnm(48, 611); // ws
        op[44] = getOpcodeRnm(7, 45); // subExpressionConstraint
        {int[] a = {46,47}; op[45] = getOpcodeAlt(a);}
        op[46] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        {int[] a = {48,49,50,53,54}; op[47] = getOpcodeCat(a);}
        {char[] a = {40}; op[48] = getOpcodeTls(a);}
        op[49] = getOpcodeRnm(48, 611); // ws
        {int[] a = {51,52}; op[50] = getOpcodeAlt(a);}
        op[51] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[52] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[53] = getOpcodeRnm(48, 611); // ws
        {char[] a = {41}; op[54] = getOpcodeTls(a);}
        {int[] a = {56,60}; op[55] = getOpcodeCat(a);}
        op[56] = getOpcodeRep((char)0, (char)1, 57);
        {int[] a = {58,59}; op[57] = getOpcodeCat(a);}
        op[58] = getOpcodeRnm(9, 63); // memberOf
        op[59] = getOpcodeRnm(48, 611); // ws
        {int[] a = {61,62}; op[60] = getOpcodeAlt(a);}
        op[61] = getOpcodeRnm(10, 90); // conceptReference
        op[62] = getOpcodeRnm(12, 101); // wildCard
        {int[] a = {64,65}; op[63] = getOpcodeAlt(a);}
        {char[] a = {94}; op[64] = getOpcodeTls(a);}
        {int[] a = {66,69,72,75,78,81,84,87}; op[65] = getOpcodeCat(a);}
        {int[] a = {67,68}; op[66] = getOpcodeAlt(a);}
        {char[] a = {109}; op[67] = getOpcodeTls(a);}
        {char[] a = {77}; op[68] = getOpcodeTls(a);}
        {int[] a = {70,71}; op[69] = getOpcodeAlt(a);}
        {char[] a = {101}; op[70] = getOpcodeTls(a);}
        {char[] a = {69}; op[71] = getOpcodeTls(a);}
        {int[] a = {73,74}; op[72] = getOpcodeAlt(a);}
        {char[] a = {109}; op[73] = getOpcodeTls(a);}
        {char[] a = {77}; op[74] = getOpcodeTls(a);}
        {int[] a = {76,77}; op[75] = getOpcodeAlt(a);}
        {char[] a = {98}; op[76] = getOpcodeTls(a);}
        {char[] a = {66}; op[77] = getOpcodeTls(a);}
        {int[] a = {79,80}; op[78] = getOpcodeAlt(a);}
        {char[] a = {101}; op[79] = getOpcodeTls(a);}
        {char[] a = {69}; op[80] = getOpcodeTls(a);}
        {int[] a = {82,83}; op[81] = getOpcodeAlt(a);}
        {char[] a = {114}; op[82] = getOpcodeTls(a);}
        {char[] a = {82}; op[83] = getOpcodeTls(a);}
        {int[] a = {85,86}; op[84] = getOpcodeAlt(a);}
        {char[] a = {111}; op[85] = getOpcodeTls(a);}
        {char[] a = {79}; op[86] = getOpcodeTls(a);}
        {int[] a = {88,89}; op[87] = getOpcodeAlt(a);}
        {char[] a = {102}; op[88] = getOpcodeTls(a);}
        {char[] a = {70}; op[89] = getOpcodeTls(a);}
        {int[] a = {91,92}; op[90] = getOpcodeCat(a);}
        op[91] = getOpcodeRnm(11, 100); // conceptId
        op[92] = getOpcodeRep((char)0, (char)1, 93);
        {int[] a = {94,95,96,97,98,99}; op[93] = getOpcodeCat(a);}
        op[94] = getOpcodeRnm(48, 611); // ws
        {char[] a = {124}; op[95] = getOpcodeTls(a);}
        op[96] = getOpcodeRnm(48, 611); // ws
        op[97] = getOpcodeRnm(13, 113); // term
        op[98] = getOpcodeRnm(48, 611); // ws
        {char[] a = {124}; op[99] = getOpcodeTls(a);}
        op[100] = getOpcodeRnm(47, 607); // sctId
        {int[] a = {102,103}; op[101] = getOpcodeAlt(a);}
        {char[] a = {42}; op[102] = getOpcodeTls(a);}
        {int[] a = {104,107,110}; op[103] = getOpcodeCat(a);}
        {int[] a = {105,106}; op[104] = getOpcodeAlt(a);}
        {char[] a = {97}; op[105] = getOpcodeTls(a);}
        {char[] a = {65}; op[106] = getOpcodeTls(a);}
        {int[] a = {108,109}; op[107] = getOpcodeAlt(a);}
        {char[] a = {110}; op[108] = getOpcodeTls(a);}
        {char[] a = {78}; op[109] = getOpcodeTls(a);}
        {int[] a = {111,112}; op[110] = getOpcodeAlt(a);}
        {char[] a = {121}; op[111] = getOpcodeTls(a);}
        {char[] a = {89}; op[112] = getOpcodeTls(a);}
        {int[] a = {114,116}; op[113] = getOpcodeCat(a);}
        op[114] = getOpcodeRep((char)1, Character.MAX_VALUE, 115);
        op[115] = getOpcodeRnm(59, 632); // nonwsNonPipe
        op[116] = getOpcodeRep((char)0, Character.MAX_VALUE, 117);
        {int[] a = {118,120}; op[117] = getOpcodeCat(a);}
        op[118] = getOpcodeRep((char)1, Character.MAX_VALUE, 119);
        op[119] = getOpcodeRnm(50, 623); // SP
        op[120] = getOpcodeRep((char)1, Character.MAX_VALUE, 121);
        op[121] = getOpcodeRnm(59, 632); // nonwsNonPipe
        {int[] a = {123,124,125,126}; op[122] = getOpcodeAlt(a);}
        op[123] = getOpcodeRnm(16, 167); // descendantOrSelfOf
        op[124] = getOpcodeRnm(15, 127); // descendantOf
        op[125] = getOpcodeRnm(18, 259); // ancestorOrSelfOf
        op[126] = getOpcodeRnm(17, 225); // ancestorOf
        {int[] a = {128,129}; op[127] = getOpcodeAlt(a);}
        {char[] a = {60}; op[128] = getOpcodeTls(a);}
        {int[] a = {130,133,136,139,142,145,148,151,154,157,160,163,166}; op[129] = getOpcodeCat(a);}
        {int[] a = {131,132}; op[130] = getOpcodeAlt(a);}
        {char[] a = {100}; op[131] = getOpcodeTls(a);}
        {char[] a = {68}; op[132] = getOpcodeTls(a);}
        {int[] a = {134,135}; op[133] = getOpcodeAlt(a);}
        {char[] a = {101}; op[134] = getOpcodeTls(a);}
        {char[] a = {69}; op[135] = getOpcodeTls(a);}
        {int[] a = {137,138}; op[136] = getOpcodeAlt(a);}
        {char[] a = {115}; op[137] = getOpcodeTls(a);}
        {char[] a = {83}; op[138] = getOpcodeTls(a);}
        {int[] a = {140,141}; op[139] = getOpcodeAlt(a);}
        {char[] a = {99}; op[140] = getOpcodeTls(a);}
        {char[] a = {67}; op[141] = getOpcodeTls(a);}
        {int[] a = {143,144}; op[142] = getOpcodeAlt(a);}
        {char[] a = {101}; op[143] = getOpcodeTls(a);}
        {char[] a = {69}; op[144] = getOpcodeTls(a);}
        {int[] a = {146,147}; op[145] = getOpcodeAlt(a);}
        {char[] a = {110}; op[146] = getOpcodeTls(a);}
        {char[] a = {78}; op[147] = getOpcodeTls(a);}
        {int[] a = {149,150}; op[148] = getOpcodeAlt(a);}
        {char[] a = {100}; op[149] = getOpcodeTls(a);}
        {char[] a = {68}; op[150] = getOpcodeTls(a);}
        {int[] a = {152,153}; op[151] = getOpcodeAlt(a);}
        {char[] a = {97}; op[152] = getOpcodeTls(a);}
        {char[] a = {65}; op[153] = getOpcodeTls(a);}
        {int[] a = {155,156}; op[154] = getOpcodeAlt(a);}
        {char[] a = {110}; op[155] = getOpcodeTls(a);}
        {char[] a = {78}; op[156] = getOpcodeTls(a);}
        {int[] a = {158,159}; op[157] = getOpcodeAlt(a);}
        {char[] a = {116}; op[158] = getOpcodeTls(a);}
        {char[] a = {84}; op[159] = getOpcodeTls(a);}
        {int[] a = {161,162}; op[160] = getOpcodeAlt(a);}
        {char[] a = {111}; op[161] = getOpcodeTls(a);}
        {char[] a = {79}; op[162] = getOpcodeTls(a);}
        {int[] a = {164,165}; op[163] = getOpcodeAlt(a);}
        {char[] a = {102}; op[164] = getOpcodeTls(a);}
        {char[] a = {70}; op[165] = getOpcodeTls(a);}
        op[166] = getOpcodeRnm(49, 617); // mws
        {int[] a = {168,169}; op[167] = getOpcodeAlt(a);}
        {char[] a = {60,60}; op[168] = getOpcodeTls(a);}
        {int[] a = {170,173,176,179,182,185,188,191,194,197,200,203,206,209,212,215,218,221,224}; op[169] = getOpcodeCat(a);}
        {int[] a = {171,172}; op[170] = getOpcodeAlt(a);}
        {char[] a = {100}; op[171] = getOpcodeTls(a);}
        {char[] a = {68}; op[172] = getOpcodeTls(a);}
        {int[] a = {174,175}; op[173] = getOpcodeAlt(a);}
        {char[] a = {101}; op[174] = getOpcodeTls(a);}
        {char[] a = {69}; op[175] = getOpcodeTls(a);}
        {int[] a = {177,178}; op[176] = getOpcodeAlt(a);}
        {char[] a = {115}; op[177] = getOpcodeTls(a);}
        {char[] a = {83}; op[178] = getOpcodeTls(a);}
        {int[] a = {180,181}; op[179] = getOpcodeAlt(a);}
        {char[] a = {99}; op[180] = getOpcodeTls(a);}
        {char[] a = {67}; op[181] = getOpcodeTls(a);}
        {int[] a = {183,184}; op[182] = getOpcodeAlt(a);}
        {char[] a = {101}; op[183] = getOpcodeTls(a);}
        {char[] a = {69}; op[184] = getOpcodeTls(a);}
        {int[] a = {186,187}; op[185] = getOpcodeAlt(a);}
        {char[] a = {110}; op[186] = getOpcodeTls(a);}
        {char[] a = {78}; op[187] = getOpcodeTls(a);}
        {int[] a = {189,190}; op[188] = getOpcodeAlt(a);}
        {char[] a = {100}; op[189] = getOpcodeTls(a);}
        {char[] a = {68}; op[190] = getOpcodeTls(a);}
        {int[] a = {192,193}; op[191] = getOpcodeAlt(a);}
        {char[] a = {97}; op[192] = getOpcodeTls(a);}
        {char[] a = {65}; op[193] = getOpcodeTls(a);}
        {int[] a = {195,196}; op[194] = getOpcodeAlt(a);}
        {char[] a = {110}; op[195] = getOpcodeTls(a);}
        {char[] a = {78}; op[196] = getOpcodeTls(a);}
        {int[] a = {198,199}; op[197] = getOpcodeAlt(a);}
        {char[] a = {116}; op[198] = getOpcodeTls(a);}
        {char[] a = {84}; op[199] = getOpcodeTls(a);}
        {int[] a = {201,202}; op[200] = getOpcodeAlt(a);}
        {char[] a = {111}; op[201] = getOpcodeTls(a);}
        {char[] a = {79}; op[202] = getOpcodeTls(a);}
        {int[] a = {204,205}; op[203] = getOpcodeAlt(a);}
        {char[] a = {114}; op[204] = getOpcodeTls(a);}
        {char[] a = {82}; op[205] = getOpcodeTls(a);}
        {int[] a = {207,208}; op[206] = getOpcodeAlt(a);}
        {char[] a = {115}; op[207] = getOpcodeTls(a);}
        {char[] a = {83}; op[208] = getOpcodeTls(a);}
        {int[] a = {210,211}; op[209] = getOpcodeAlt(a);}
        {char[] a = {101}; op[210] = getOpcodeTls(a);}
        {char[] a = {69}; op[211] = getOpcodeTls(a);}
        {int[] a = {213,214}; op[212] = getOpcodeAlt(a);}
        {char[] a = {108}; op[213] = getOpcodeTls(a);}
        {char[] a = {76}; op[214] = getOpcodeTls(a);}
        {int[] a = {216,217}; op[215] = getOpcodeAlt(a);}
        {char[] a = {102}; op[216] = getOpcodeTls(a);}
        {char[] a = {70}; op[217] = getOpcodeTls(a);}
        {int[] a = {219,220}; op[218] = getOpcodeAlt(a);}
        {char[] a = {111}; op[219] = getOpcodeTls(a);}
        {char[] a = {79}; op[220] = getOpcodeTls(a);}
        {int[] a = {222,223}; op[221] = getOpcodeAlt(a);}
        {char[] a = {102}; op[222] = getOpcodeTls(a);}
        {char[] a = {70}; op[223] = getOpcodeTls(a);}
        op[224] = getOpcodeRnm(49, 617); // mws
        {int[] a = {226,227}; op[225] = getOpcodeAlt(a);}
        {char[] a = {62}; op[226] = getOpcodeTls(a);}
        {int[] a = {228,231,234,237,240,243,246,249,252,255,258}; op[227] = getOpcodeCat(a);}
        {int[] a = {229,230}; op[228] = getOpcodeAlt(a);}
        {char[] a = {97}; op[229] = getOpcodeTls(a);}
        {char[] a = {65}; op[230] = getOpcodeTls(a);}
        {int[] a = {232,233}; op[231] = getOpcodeAlt(a);}
        {char[] a = {110}; op[232] = getOpcodeTls(a);}
        {char[] a = {78}; op[233] = getOpcodeTls(a);}
        {int[] a = {235,236}; op[234] = getOpcodeAlt(a);}
        {char[] a = {99}; op[235] = getOpcodeTls(a);}
        {char[] a = {67}; op[236] = getOpcodeTls(a);}
        {int[] a = {238,239}; op[237] = getOpcodeAlt(a);}
        {char[] a = {101}; op[238] = getOpcodeTls(a);}
        {char[] a = {69}; op[239] = getOpcodeTls(a);}
        {int[] a = {241,242}; op[240] = getOpcodeAlt(a);}
        {char[] a = {115}; op[241] = getOpcodeTls(a);}
        {char[] a = {83}; op[242] = getOpcodeTls(a);}
        {int[] a = {244,245}; op[243] = getOpcodeAlt(a);}
        {char[] a = {116}; op[244] = getOpcodeTls(a);}
        {char[] a = {84}; op[245] = getOpcodeTls(a);}
        {int[] a = {247,248}; op[246] = getOpcodeAlt(a);}
        {char[] a = {111}; op[247] = getOpcodeTls(a);}
        {char[] a = {79}; op[248] = getOpcodeTls(a);}
        {int[] a = {250,251}; op[249] = getOpcodeAlt(a);}
        {char[] a = {114}; op[250] = getOpcodeTls(a);}
        {char[] a = {82}; op[251] = getOpcodeTls(a);}
        {int[] a = {253,254}; op[252] = getOpcodeAlt(a);}
        {char[] a = {111}; op[253] = getOpcodeTls(a);}
        {char[] a = {79}; op[254] = getOpcodeTls(a);}
        {int[] a = {256,257}; op[255] = getOpcodeAlt(a);}
        {char[] a = {102}; op[256] = getOpcodeTls(a);}
        {char[] a = {70}; op[257] = getOpcodeTls(a);}
        op[258] = getOpcodeRnm(49, 617); // mws
        {int[] a = {260,261}; op[259] = getOpcodeAlt(a);}
        {char[] a = {62,62}; op[260] = getOpcodeTls(a);}
        {int[] a = {262,265,268,271,274,277,280,283,286,289,292,295,298,301,304,307,310}; op[261] = getOpcodeCat(a);}
        {int[] a = {263,264}; op[262] = getOpcodeAlt(a);}
        {char[] a = {97}; op[263] = getOpcodeTls(a);}
        {char[] a = {65}; op[264] = getOpcodeTls(a);}
        {int[] a = {266,267}; op[265] = getOpcodeAlt(a);}
        {char[] a = {110}; op[266] = getOpcodeTls(a);}
        {char[] a = {78}; op[267] = getOpcodeTls(a);}
        {int[] a = {269,270}; op[268] = getOpcodeAlt(a);}
        {char[] a = {99}; op[269] = getOpcodeTls(a);}
        {char[] a = {67}; op[270] = getOpcodeTls(a);}
        {int[] a = {272,273}; op[271] = getOpcodeAlt(a);}
        {char[] a = {101}; op[272] = getOpcodeTls(a);}
        {char[] a = {69}; op[273] = getOpcodeTls(a);}
        {int[] a = {275,276}; op[274] = getOpcodeAlt(a);}
        {char[] a = {115}; op[275] = getOpcodeTls(a);}
        {char[] a = {83}; op[276] = getOpcodeTls(a);}
        {int[] a = {278,279}; op[277] = getOpcodeAlt(a);}
        {char[] a = {116}; op[278] = getOpcodeTls(a);}
        {char[] a = {84}; op[279] = getOpcodeTls(a);}
        {int[] a = {281,282}; op[280] = getOpcodeAlt(a);}
        {char[] a = {111}; op[281] = getOpcodeTls(a);}
        {char[] a = {79}; op[282] = getOpcodeTls(a);}
        {int[] a = {284,285}; op[283] = getOpcodeAlt(a);}
        {char[] a = {114}; op[284] = getOpcodeTls(a);}
        {char[] a = {82}; op[285] = getOpcodeTls(a);}
        {int[] a = {287,288}; op[286] = getOpcodeAlt(a);}
        {char[] a = {111}; op[287] = getOpcodeTls(a);}
        {char[] a = {79}; op[288] = getOpcodeTls(a);}
        {int[] a = {290,291}; op[289] = getOpcodeAlt(a);}
        {char[] a = {114}; op[290] = getOpcodeTls(a);}
        {char[] a = {82}; op[291] = getOpcodeTls(a);}
        {int[] a = {293,294}; op[292] = getOpcodeAlt(a);}
        {char[] a = {115}; op[293] = getOpcodeTls(a);}
        {char[] a = {83}; op[294] = getOpcodeTls(a);}
        {int[] a = {296,297}; op[295] = getOpcodeAlt(a);}
        {char[] a = {101}; op[296] = getOpcodeTls(a);}
        {char[] a = {69}; op[297] = getOpcodeTls(a);}
        {int[] a = {299,300}; op[298] = getOpcodeAlt(a);}
        {char[] a = {108}; op[299] = getOpcodeTls(a);}
        {char[] a = {76}; op[300] = getOpcodeTls(a);}
        {int[] a = {302,303}; op[301] = getOpcodeAlt(a);}
        {char[] a = {102}; op[302] = getOpcodeTls(a);}
        {char[] a = {70}; op[303] = getOpcodeTls(a);}
        {int[] a = {305,306}; op[304] = getOpcodeAlt(a);}
        {char[] a = {111}; op[305] = getOpcodeTls(a);}
        {char[] a = {79}; op[306] = getOpcodeTls(a);}
        {int[] a = {308,309}; op[307] = getOpcodeAlt(a);}
        {char[] a = {102}; op[308] = getOpcodeTls(a);}
        {char[] a = {70}; op[309] = getOpcodeTls(a);}
        op[310] = getOpcodeRnm(49, 617); // mws
        {int[] a = {312,323}; op[311] = getOpcodeAlt(a);}
        {int[] a = {313,316,319,322}; op[312] = getOpcodeCat(a);}
        {int[] a = {314,315}; op[313] = getOpcodeAlt(a);}
        {char[] a = {97}; op[314] = getOpcodeTls(a);}
        {char[] a = {65}; op[315] = getOpcodeTls(a);}
        {int[] a = {317,318}; op[316] = getOpcodeAlt(a);}
        {char[] a = {110}; op[317] = getOpcodeTls(a);}
        {char[] a = {78}; op[318] = getOpcodeTls(a);}
        {int[] a = {320,321}; op[319] = getOpcodeAlt(a);}
        {char[] a = {100}; op[320] = getOpcodeTls(a);}
        {char[] a = {68}; op[321] = getOpcodeTls(a);}
        op[322] = getOpcodeRnm(49, 617); // mws
        {char[] a = {44}; op[323] = getOpcodeTls(a);}
        {int[] a = {325,328,331}; op[324] = getOpcodeCat(a);}
        {int[] a = {326,327}; op[325] = getOpcodeAlt(a);}
        {char[] a = {111}; op[326] = getOpcodeTls(a);}
        {char[] a = {79}; op[327] = getOpcodeTls(a);}
        {int[] a = {329,330}; op[328] = getOpcodeAlt(a);}
        {char[] a = {114}; op[329] = getOpcodeTls(a);}
        {char[] a = {82}; op[330] = getOpcodeTls(a);}
        op[331] = getOpcodeRnm(49, 617); // mws
        {int[] a = {333,336,339,342,345,348}; op[332] = getOpcodeCat(a);}
        {int[] a = {334,335}; op[333] = getOpcodeAlt(a);}
        {char[] a = {109}; op[334] = getOpcodeTls(a);}
        {char[] a = {77}; op[335] = getOpcodeTls(a);}
        {int[] a = {337,338}; op[336] = getOpcodeAlt(a);}
        {char[] a = {105}; op[337] = getOpcodeTls(a);}
        {char[] a = {73}; op[338] = getOpcodeTls(a);}
        {int[] a = {340,341}; op[339] = getOpcodeAlt(a);}
        {char[] a = {110}; op[340] = getOpcodeTls(a);}
        {char[] a = {78}; op[341] = getOpcodeTls(a);}
        {int[] a = {343,344}; op[342] = getOpcodeAlt(a);}
        {char[] a = {117}; op[343] = getOpcodeTls(a);}
        {char[] a = {85}; op[344] = getOpcodeTls(a);}
        {int[] a = {346,347}; op[345] = getOpcodeAlt(a);}
        {char[] a = {115}; op[346] = getOpcodeTls(a);}
        {char[] a = {83}; op[347] = getOpcodeTls(a);}
        op[348] = getOpcodeRnm(49, 617); // mws
        {int[] a = {350,351,352}; op[349] = getOpcodeCat(a);}
        op[350] = getOpcodeRnm(25, 368); // subRefinement
        op[351] = getOpcodeRnm(48, 611); // ws
        op[352] = getOpcodeRep((char)0, (char)1, 353);
        {int[] a = {354,355}; op[353] = getOpcodeAlt(a);}
        op[354] = getOpcodeRnm(23, 356); // conjunctionRefinementSet
        op[355] = getOpcodeRnm(24, 362); // disjunctionRefinementSet
        op[356] = getOpcodeRep((char)1, Character.MAX_VALUE, 357);
        {int[] a = {358,359,360,361}; op[357] = getOpcodeCat(a);}
        op[358] = getOpcodeRnm(48, 611); // ws
        op[359] = getOpcodeRnm(19, 311); // conjunction
        op[360] = getOpcodeRnm(48, 611); // ws
        op[361] = getOpcodeRnm(25, 368); // subRefinement
        op[362] = getOpcodeRep((char)1, Character.MAX_VALUE, 363);
        {int[] a = {364,365,366,367}; op[363] = getOpcodeCat(a);}
        op[364] = getOpcodeRnm(48, 611); // ws
        op[365] = getOpcodeRnm(20, 324); // disjunction
        op[366] = getOpcodeRnm(48, 611); // ws
        op[367] = getOpcodeRnm(25, 368); // subRefinement
        {int[] a = {369,370,371}; op[368] = getOpcodeAlt(a);}
        op[369] = getOpcodeRnm(26, 377); // attributeSet
        op[370] = getOpcodeRnm(30, 404); // attributeGroup
        {int[] a = {372,373,374,375,376}; op[371] = getOpcodeCat(a);}
        {char[] a = {40}; op[372] = getOpcodeTls(a);}
        op[373] = getOpcodeRnm(48, 611); // ws
        op[374] = getOpcodeRnm(22, 349); // refinement
        op[375] = getOpcodeRnm(48, 611); // ws
        {char[] a = {41}; op[376] = getOpcodeTls(a);}
        {int[] a = {378,379,380}; op[377] = getOpcodeCat(a);}
        op[378] = getOpcodeRnm(29, 396); // subAttributeSet
        op[379] = getOpcodeRnm(48, 611); // ws
        op[380] = getOpcodeRep((char)0, (char)1, 381);
        {int[] a = {382,383}; op[381] = getOpcodeAlt(a);}
        op[382] = getOpcodeRnm(27, 384); // conjunctionAttributeSet
        op[383] = getOpcodeRnm(28, 390); // disjunctionAttributeSet
        op[384] = getOpcodeRep((char)1, Character.MAX_VALUE, 385);
        {int[] a = {386,387,388,389}; op[385] = getOpcodeCat(a);}
        op[386] = getOpcodeRnm(48, 611); // ws
        op[387] = getOpcodeRnm(19, 311); // conjunction
        op[388] = getOpcodeRnm(48, 611); // ws
        op[389] = getOpcodeRnm(29, 396); // subAttributeSet
        op[390] = getOpcodeRep((char)1, Character.MAX_VALUE, 391);
        {int[] a = {392,393,394,395}; op[391] = getOpcodeCat(a);}
        op[392] = getOpcodeRnm(48, 611); // ws
        op[393] = getOpcodeRnm(20, 324); // disjunction
        op[394] = getOpcodeRnm(48, 611); // ws
        op[395] = getOpcodeRnm(29, 396); // subAttributeSet
        {int[] a = {397,398}; op[396] = getOpcodeAlt(a);}
        op[397] = getOpcodeRnm(31, 414); // attribute
        {int[] a = {399,400,401,402,403}; op[398] = getOpcodeCat(a);}
        {char[] a = {40}; op[399] = getOpcodeTls(a);}
        op[400] = getOpcodeRnm(48, 611); // ws
        op[401] = getOpcodeRnm(26, 377); // attributeSet
        op[402] = getOpcodeRnm(48, 611); // ws
        {char[] a = {41}; op[403] = getOpcodeTls(a);}
        {int[] a = {405,409,410,411,412,413}; op[404] = getOpcodeCat(a);}
        op[405] = getOpcodeRep((char)0, (char)1, 406);
        {int[] a = {407,408}; op[406] = getOpcodeCat(a);}
        op[407] = getOpcodeRnm(32, 442); // cardinality
        op[408] = getOpcodeRnm(48, 611); // ws
        {char[] a = {123}; op[409] = getOpcodeTls(a);}
        op[410] = getOpcodeRnm(48, 611); // ws
        op[411] = getOpcodeRnm(26, 377); // attributeSet
        op[412] = getOpcodeRnm(48, 611); // ws
        {char[] a = {125}; op[413] = getOpcodeTls(a);}
        {int[] a = {415,419,423,427,428,429}; op[414] = getOpcodeCat(a);}
        op[415] = getOpcodeRep((char)0, (char)1, 416);
        {int[] a = {417,418}; op[416] = getOpcodeCat(a);}
        op[417] = getOpcodeRnm(32, 442); // cardinality
        op[418] = getOpcodeRnm(48, 611); // ws
        op[419] = getOpcodeRep((char)0, (char)1, 420);
        {int[] a = {421,422}; op[420] = getOpcodeCat(a);}
        op[421] = getOpcodeRnm(35, 476); // reverseFlag
        op[422] = getOpcodeRnm(48, 611); // ws
        op[423] = getOpcodeRep((char)0, (char)1, 424);
        {int[] a = {425,426}; op[424] = getOpcodeCat(a);}
        op[425] = getOpcodeRnm(36, 506); // attributeOperator
        op[426] = getOpcodeRnm(48, 611); // ws
        op[427] = getOpcodeRnm(37, 509); // attributeName
        op[428] = getOpcodeRnm(48, 611); // ws
        {int[] a = {430,434,438}; op[429] = getOpcodeAlt(a);}
        {int[] a = {431,432,433}; op[430] = getOpcodeCat(a);}
        op[431] = getOpcodeRnm(39, 522); // expressionComparisonOperator
        op[432] = getOpcodeRnm(48, 611); // ws
        op[433] = getOpcodeRnm(38, 512); // expressionConstraintValue
        {int[] a = {435,436,437}; op[434] = getOpcodeCat(a);}
        op[435] = getOpcodeRnm(40, 538); // numericComparisonOperator
        op[436] = getOpcodeRnm(48, 611); // ws
        op[437] = getOpcodeRnm(42, 574); // numericValue
        {int[] a = {439,440,441}; op[438] = getOpcodeCat(a);}
        op[439] = getOpcodeRnm(41, 558); // stringComparisonOperator
        op[440] = getOpcodeRnm(48, 611); // ws
        op[441] = getOpcodeRnm(43, 579); // stringValue
        {int[] a = {443,444,445,446,449}; op[442] = getOpcodeCat(a);}
        {char[] a = {91}; op[443] = getOpcodeTls(a);}
        op[444] = getOpcodeRnm(46, 601); // nonNegativeIntegerValue
        op[445] = getOpcodeRnm(33, 450); // to
        {int[] a = {447,448}; op[446] = getOpcodeAlt(a);}
        op[447] = getOpcodeRnm(46, 601); // nonNegativeIntegerValue
        op[448] = getOpcodeRnm(34, 461); // many
        {char[] a = {93}; op[449] = getOpcodeTls(a);}
        {int[] a = {451,452}; op[450] = getOpcodeAlt(a);}
        {char[] a = {46,46}; op[451] = getOpcodeTls(a);}
        {int[] a = {453,454,457,460}; op[452] = getOpcodeCat(a);}
        op[453] = getOpcodeRnm(49, 617); // mws
        {int[] a = {455,456}; op[454] = getOpcodeAlt(a);}
        {char[] a = {116}; op[455] = getOpcodeTls(a);}
        {char[] a = {84}; op[456] = getOpcodeTls(a);}
        {int[] a = {458,459}; op[457] = getOpcodeAlt(a);}
        {char[] a = {111}; op[458] = getOpcodeTls(a);}
        {char[] a = {79}; op[459] = getOpcodeTls(a);}
        op[460] = getOpcodeRnm(49, 617); // mws
        {int[] a = {462,463}; op[461] = getOpcodeAlt(a);}
        {char[] a = {42}; op[462] = getOpcodeTls(a);}
        {int[] a = {464,467,470,473}; op[463] = getOpcodeCat(a);}
        {int[] a = {465,466}; op[464] = getOpcodeAlt(a);}
        {char[] a = {109}; op[465] = getOpcodeTls(a);}
        {char[] a = {77}; op[466] = getOpcodeTls(a);}
        {int[] a = {468,469}; op[467] = getOpcodeAlt(a);}
        {char[] a = {97}; op[468] = getOpcodeTls(a);}
        {char[] a = {65}; op[469] = getOpcodeTls(a);}
        {int[] a = {471,472}; op[470] = getOpcodeAlt(a);}
        {char[] a = {110}; op[471] = getOpcodeTls(a);}
        {char[] a = {78}; op[472] = getOpcodeTls(a);}
        {int[] a = {474,475}; op[473] = getOpcodeAlt(a);}
        {char[] a = {121}; op[474] = getOpcodeTls(a);}
        {char[] a = {89}; op[475] = getOpcodeTls(a);}
        {int[] a = {477,505}; op[476] = getOpcodeAlt(a);}
        {int[] a = {478,481,484,487,490,493,496,499,502}; op[477] = getOpcodeCat(a);}
        {int[] a = {479,480}; op[478] = getOpcodeAlt(a);}
        {char[] a = {114}; op[479] = getOpcodeTls(a);}
        {char[] a = {82}; op[480] = getOpcodeTls(a);}
        {int[] a = {482,483}; op[481] = getOpcodeAlt(a);}
        {char[] a = {101}; op[482] = getOpcodeTls(a);}
        {char[] a = {69}; op[483] = getOpcodeTls(a);}
        {int[] a = {485,486}; op[484] = getOpcodeAlt(a);}
        {char[] a = {118}; op[485] = getOpcodeTls(a);}
        {char[] a = {86}; op[486] = getOpcodeTls(a);}
        {int[] a = {488,489}; op[487] = getOpcodeAlt(a);}
        {char[] a = {101}; op[488] = getOpcodeTls(a);}
        {char[] a = {69}; op[489] = getOpcodeTls(a);}
        {int[] a = {491,492}; op[490] = getOpcodeAlt(a);}
        {char[] a = {114}; op[491] = getOpcodeTls(a);}
        {char[] a = {82}; op[492] = getOpcodeTls(a);}
        {int[] a = {494,495}; op[493] = getOpcodeAlt(a);}
        {char[] a = {115}; op[494] = getOpcodeTls(a);}
        {char[] a = {83}; op[495] = getOpcodeTls(a);}
        {int[] a = {497,498}; op[496] = getOpcodeAlt(a);}
        {char[] a = {101}; op[497] = getOpcodeTls(a);}
        {char[] a = {69}; op[498] = getOpcodeTls(a);}
        {int[] a = {500,501}; op[499] = getOpcodeAlt(a);}
        {char[] a = {111}; op[500] = getOpcodeTls(a);}
        {char[] a = {79}; op[501] = getOpcodeTls(a);}
        {int[] a = {503,504}; op[502] = getOpcodeAlt(a);}
        {char[] a = {102}; op[503] = getOpcodeTls(a);}
        {char[] a = {70}; op[504] = getOpcodeTls(a);}
        {char[] a = {82}; op[505] = getOpcodeTls(a);}
        {int[] a = {507,508}; op[506] = getOpcodeAlt(a);}
        op[507] = getOpcodeRnm(16, 167); // descendantOrSelfOf
        op[508] = getOpcodeRnm(15, 127); // descendantOf
        {int[] a = {510,511}; op[509] = getOpcodeAlt(a);}
        op[510] = getOpcodeRnm(10, 90); // conceptReference
        op[511] = getOpcodeRnm(12, 101); // wildCard
        {int[] a = {513,514}; op[512] = getOpcodeAlt(a);}
        op[513] = getOpcodeRnm(1, 7); // simpleExpressionConstraint
        {int[] a = {515,516,517,520,521}; op[514] = getOpcodeCat(a);}
        {char[] a = {40}; op[515] = getOpcodeTls(a);}
        op[516] = getOpcodeRnm(48, 611); // ws
        {int[] a = {518,519}; op[517] = getOpcodeAlt(a);}
        op[518] = getOpcodeRnm(2, 13); // refinedExpressionConstraint
        op[519] = getOpcodeRnm(3, 19); // compoundExpressionConstraint
        op[520] = getOpcodeRnm(48, 611); // ws
        {char[] a = {41}; op[521] = getOpcodeTls(a);}
        {int[] a = {523,524,525,537}; op[522] = getOpcodeAlt(a);}
        {char[] a = {61}; op[523] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[524] = getOpcodeTls(a);}
        {int[] a = {526,529,532,535,536}; op[525] = getOpcodeCat(a);}
        {int[] a = {527,528}; op[526] = getOpcodeAlt(a);}
        {char[] a = {110}; op[527] = getOpcodeTls(a);}
        {char[] a = {78}; op[528] = getOpcodeTls(a);}
        {int[] a = {530,531}; op[529] = getOpcodeAlt(a);}
        {char[] a = {111}; op[530] = getOpcodeTls(a);}
        {char[] a = {79}; op[531] = getOpcodeTls(a);}
        {int[] a = {533,534}; op[532] = getOpcodeAlt(a);}
        {char[] a = {116}; op[533] = getOpcodeTls(a);}
        {char[] a = {84}; op[534] = getOpcodeTls(a);}
        op[535] = getOpcodeRnm(48, 611); // ws
        {char[] a = {61}; op[536] = getOpcodeTls(a);}
        {char[] a = {60,62}; op[537] = getOpcodeTls(a);}
        {int[] a = {539,540,541,553,554,555,556,557}; op[538] = getOpcodeAlt(a);}
        {char[] a = {61}; op[539] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[540] = getOpcodeTls(a);}
        {int[] a = {542,545,548,551,552}; op[541] = getOpcodeCat(a);}
        {int[] a = {543,544}; op[542] = getOpcodeAlt(a);}
        {char[] a = {110}; op[543] = getOpcodeTls(a);}
        {char[] a = {78}; op[544] = getOpcodeTls(a);}
        {int[] a = {546,547}; op[545] = getOpcodeAlt(a);}
        {char[] a = {111}; op[546] = getOpcodeTls(a);}
        {char[] a = {79}; op[547] = getOpcodeTls(a);}
        {int[] a = {549,550}; op[548] = getOpcodeAlt(a);}
        {char[] a = {116}; op[549] = getOpcodeTls(a);}
        {char[] a = {84}; op[550] = getOpcodeTls(a);}
        op[551] = getOpcodeRnm(48, 611); // ws
        {char[] a = {61}; op[552] = getOpcodeTls(a);}
        {char[] a = {60,62}; op[553] = getOpcodeTls(a);}
        {char[] a = {60,61}; op[554] = getOpcodeTls(a);}
        {char[] a = {60}; op[555] = getOpcodeTls(a);}
        {char[] a = {62,61}; op[556] = getOpcodeTls(a);}
        {char[] a = {62}; op[557] = getOpcodeTls(a);}
        {int[] a = {559,560,561,573}; op[558] = getOpcodeAlt(a);}
        {char[] a = {61}; op[559] = getOpcodeTls(a);}
        {char[] a = {33,61}; op[560] = getOpcodeTls(a);}
        {int[] a = {562,565,568,571,572}; op[561] = getOpcodeCat(a);}
        {int[] a = {563,564}; op[562] = getOpcodeAlt(a);}
        {char[] a = {110}; op[563] = getOpcodeTls(a);}
        {char[] a = {78}; op[564] = getOpcodeTls(a);}
        {int[] a = {566,567}; op[565] = getOpcodeAlt(a);}
        {char[] a = {111}; op[566] = getOpcodeTls(a);}
        {char[] a = {79}; op[567] = getOpcodeTls(a);}
        {int[] a = {569,570}; op[568] = getOpcodeAlt(a);}
        {char[] a = {116}; op[569] = getOpcodeTls(a);}
        {char[] a = {84}; op[570] = getOpcodeTls(a);}
        op[571] = getOpcodeRnm(48, 611); // ws
        {char[] a = {61}; op[572] = getOpcodeTls(a);}
        {char[] a = {60,62}; op[573] = getOpcodeTls(a);}
        {int[] a = {575,576}; op[574] = getOpcodeCat(a);}
        {char[] a = {35}; op[575] = getOpcodeTls(a);}
        {int[] a = {577,578}; op[576] = getOpcodeAlt(a);}
        op[577] = getOpcodeRnm(45, 596); // decimalValue
        op[578] = getOpcodeRnm(44, 586); // integerValue
        {int[] a = {580,581,585}; op[579] = getOpcodeCat(a);}
        op[580] = getOpcodeRnm(54, 627); // QM
        op[581] = getOpcodeRep((char)1, Character.MAX_VALUE, 582);
        {int[] a = {583,584}; op[582] = getOpcodeAlt(a);}
        op[583] = getOpcodeRnm(60, 638); // anyNonEscapedChar
        op[584] = getOpcodeRnm(61, 648); // escapedChar
        op[585] = getOpcodeRnm(54, 627); // QM
        {int[] a = {587,595}; op[586] = getOpcodeAlt(a);}
        {int[] a = {588,592,593}; op[587] = getOpcodeCat(a);}
        op[588] = getOpcodeRep((char)0, (char)1, 589);
        {int[] a = {590,591}; op[589] = getOpcodeAlt(a);}
        {char[] a = {45}; op[590] = getOpcodeTls(a);}
        {char[] a = {43}; op[591] = getOpcodeTls(a);}
        op[592] = getOpcodeRnm(58, 631); // digitNonZero
        op[593] = getOpcodeRep((char)0, Character.MAX_VALUE, 594);
        op[594] = getOpcodeRnm(56, 629); // digit
        op[595] = getOpcodeRnm(57, 630); // zero
        {int[] a = {597,598,599}; op[596] = getOpcodeCat(a);}
        op[597] = getOpcodeRnm(44, 586); // integerValue
        {char[] a = {46}; op[598] = getOpcodeTls(a);}
        op[599] = getOpcodeRep((char)1, Character.MAX_VALUE, 600);
        op[600] = getOpcodeRnm(56, 629); // digit
        {int[] a = {602,606}; op[601] = getOpcodeAlt(a);}
        {int[] a = {603,604}; op[602] = getOpcodeCat(a);}
        op[603] = getOpcodeRnm(58, 631); // digitNonZero
        op[604] = getOpcodeRep((char)0, Character.MAX_VALUE, 605);
        op[605] = getOpcodeRnm(56, 629); // digit
        op[606] = getOpcodeRnm(57, 630); // zero
        {int[] a = {608,609}; op[607] = getOpcodeCat(a);}
        op[608] = getOpcodeRnm(58, 631); // digitNonZero
        op[609] = getOpcodeRep((char)5, (char)17, 610);
        op[610] = getOpcodeRnm(56, 629); // digit
        op[611] = getOpcodeRep((char)0, Character.MAX_VALUE, 612);
        {int[] a = {613,614,615,616}; op[612] = getOpcodeAlt(a);}
        op[613] = getOpcodeRnm(50, 623); // SP
        op[614] = getOpcodeRnm(51, 624); // HTAB
        op[615] = getOpcodeRnm(52, 625); // CR
        op[616] = getOpcodeRnm(53, 626); // LF
        op[617] = getOpcodeRep((char)1, Character.MAX_VALUE, 618);
        {int[] a = {619,620,621,622}; op[618] = getOpcodeAlt(a);}
        op[619] = getOpcodeRnm(50, 623); // SP
        op[620] = getOpcodeRnm(51, 624); // HTAB
        op[621] = getOpcodeRnm(52, 625); // CR
        op[622] = getOpcodeRnm(53, 626); // LF
        {char[] a = {32}; op[623] = getOpcodeTbs(a);}
        {char[] a = {9}; op[624] = getOpcodeTbs(a);}
        {char[] a = {13}; op[625] = getOpcodeTbs(a);}
        {char[] a = {10}; op[626] = getOpcodeTbs(a);}
        {char[] a = {34}; op[627] = getOpcodeTbs(a);}
        {char[] a = {92}; op[628] = getOpcodeTbs(a);}
        op[629] = getOpcodeTrg((char)48, (char)57);
        {char[] a = {48}; op[630] = getOpcodeTbs(a);}
        op[631] = getOpcodeTrg((char)49, (char)57);
        {int[] a = {633,634,635,636,637}; op[632] = getOpcodeAlt(a);}
        op[633] = getOpcodeTrg((char)33, (char)123);
        op[634] = getOpcodeTrg((char)125, (char)126);
        op[635] = getOpcodeRnm(62, 655); // UTF8-2
        op[636] = getOpcodeRnm(63, 658); // UTF8-3
        op[637] = getOpcodeRnm(64, 675); // UTF8-4
        {int[] a = {639,640,641,642,643,644,645,646,647}; op[638] = getOpcodeAlt(a);}
        op[639] = getOpcodeRnm(51, 624); // HTAB
        op[640] = getOpcodeRnm(52, 625); // CR
        op[641] = getOpcodeRnm(53, 626); // LF
        op[642] = getOpcodeTrg((char)32, (char)33);
        op[643] = getOpcodeTrg((char)35, (char)91);
        op[644] = getOpcodeTrg((char)93, (char)126);
        op[645] = getOpcodeRnm(62, 655); // UTF8-2
        op[646] = getOpcodeRnm(63, 658); // UTF8-3
        op[647] = getOpcodeRnm(64, 675); // UTF8-4
        {int[] a = {649,652}; op[648] = getOpcodeAlt(a);}
        {int[] a = {650,651}; op[649] = getOpcodeCat(a);}
        op[650] = getOpcodeRnm(55, 628); // BS
        op[651] = getOpcodeRnm(54, 627); // QM
        {int[] a = {653,654}; op[652] = getOpcodeCat(a);}
        op[653] = getOpcodeRnm(55, 628); // BS
        op[654] = getOpcodeRnm(55, 628); // BS
        {int[] a = {656,657}; op[655] = getOpcodeCat(a);}
        op[656] = getOpcodeTrg((char)194, (char)223);
        op[657] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {659,663,667,671}; op[658] = getOpcodeAlt(a);}
        {int[] a = {660,661,662}; op[659] = getOpcodeCat(a);}
        {char[] a = {224}; op[660] = getOpcodeTbs(a);}
        op[661] = getOpcodeTrg((char)160, (char)191);
        op[662] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {664,665}; op[663] = getOpcodeCat(a);}
        op[664] = getOpcodeTrg((char)225, (char)236);
        op[665] = getOpcodeRep((char)2, (char)2, 666);
        op[666] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {668,669,670}; op[667] = getOpcodeCat(a);}
        {char[] a = {237}; op[668] = getOpcodeTbs(a);}
        op[669] = getOpcodeTrg((char)128, (char)159);
        op[670] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {672,673}; op[671] = getOpcodeCat(a);}
        op[672] = getOpcodeTrg((char)238, (char)239);
        op[673] = getOpcodeRep((char)2, (char)2, 674);
        op[674] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {676,681,685}; op[675] = getOpcodeAlt(a);}
        {int[] a = {677,678,679}; op[676] = getOpcodeCat(a);}
        {char[] a = {240}; op[677] = getOpcodeTbs(a);}
        op[678] = getOpcodeTrg((char)144, (char)191);
        op[679] = getOpcodeRep((char)2, (char)2, 680);
        op[680] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {682,683}; op[681] = getOpcodeCat(a);}
        op[682] = getOpcodeTrg((char)241, (char)243);
        op[683] = getOpcodeRep((char)3, (char)3, 684);
        op[684] = getOpcodeRnm(65, 690); // UTF8-tail
        {int[] a = {686,687,688}; op[685] = getOpcodeCat(a);}
        {char[] a = {244}; op[686] = getOpcodeTbs(a);}
        op[687] = getOpcodeTrg((char)128, (char)143);
        op[688] = getOpcodeRep((char)2, (char)2, 689);
        op[689] = getOpcodeRnm(65, 690); // UTF8-tail
        op[690] = getOpcodeTrg((char)128, (char)191);
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; package.name.ECLparserFull.java");
        out.println(";");
        out.println("expressionConstraint = ws ( refinedExpressionConstraint / compoundExpressionConstraint / simpleExpressionConstraint ) ws");
        out.println("simpleExpressionConstraint =  [constraintOperator ws] focusConcept ");
        out.println("refinedExpressionConstraint = simpleExpressionConstraint  ws \":\" ws refinement");
        out.println("compoundExpressionConstraint = conjunctionExpressionConstraint /disjunctionExpressionConstraint / exclusionExpressionConstraint");
        out.println("conjunctionExpressionConstraint = subExpressionConstraint 1*(ws conjunction ws subExpressionConstraint)");
        out.println("disjunctionExpressionConstraint = subExpressionConstraint 1*(ws disjunction ws subExpressionConstraint)");
        out.println("exclusionExpressionConstraint = subExpressionConstraint ws exclusion ws subExpressionConstraint");
        out.println("subExpressionConstraint = simpleExpressionConstraint / \"(\" ws (compoundExpressionConstraint / refinedExpressionConstraint) ws \")\"");
        out.println("focusConcept = [ memberOf ws] (conceptReference / wildCard)");
        out.println("memberOf = \"^\" /  (\"m\"/\"M\") (\"e\"/\"E\") (\"m\"/\"M\") (\"b\"/\"B\") (\"e\"/\"E\") (\"r\"/\"R\") (\"o\"/\"O\") (\"f\"/\"F\") ");
        out.println("conceptReference = conceptId [ws \"|\" ws term ws \"|\"]");
        out.println("conceptId = sctId");
        out.println("wildCard = \"*\" / ( (\"a\"/\"A\") (\"n\"/\"N\") (\"y\"/\"Y\") )");
        out.println("term = 1*nonwsNonPipe *( 1*SP 1*nonwsNonPipe )");
        out.println("constraintOperator = descendantOrSelfOf / descendantOf /  ancestorOrSelfOf / ancestorOf ");
        out.println("descendantOf = \"<\" / ( (\"d\"/\"D\") (\"e\"/\"E\") (\"s\"/\"S\") (\"c\"/\"C\") (\"e\"/\"E\") (\"n\"/\"N\") (\"d\"/\"D\") (\"a\"/\"A\") (\"n\"/\"N\") (\"t\"/\"T\") (\"o\"/\"O\") (\"f\"/\"F\")  mws )");
        out.println("descendantOrSelfOf = \"<<\" / ( (\"d\"/\"D\") (\"e\"/\"E\") (\"s\"/\"S\") (\"c\"/\"C\") (\"e\"/\"E\") (\"n\"/\"N\") (\"d\"/\"D\") (\"a\"/\"A\") (\"n\"/\"N\") (\"t\"/\"T\") (\"o\"/\"O\") (\"r\"/\"R\") (\"s\"/\"S\") (\"e\"/\"E\") (\"l\"/\"L\") (\"f\"/\"F\") (\"o\"/\"O\") (\"f\"/\"F\") mws )");
        out.println("ancestorOf = \">\" / ( (\"a\"/\"A\") (\"n\"/\"N\") (\"c\"/\"C\") (\"e\"/\"E\") (\"s\"/\"S\") (\"t\"/\"T\") (\"o\"/\"O\") (\"r\"/\"R\") (\"o\"/\"O\") (\"f\"/\"F\")  mws )");
        out.println("ancestorOrSelfOf = \">>\" / ( (\"a\"/\"A\") (\"n\"/\"N\") (\"c\"/\"C\") (\"e\"/\"E\") (\"s\"/\"S\") (\"t\"/\"T\") (\"o\"/\"O\") (\"r\"/\"R\") (\"o\"/\"O\") (\"r\"/\"R\") (\"s\"/\"S\") (\"e\"/\"E\") (\"l\"/\"L\") (\"f\"/\"F\") (\"o\"/\"O\") (\"f\"/\"F\") mws )");
        out.println("conjunction = ((\"a\"/\"A\") (\"n\"/\"N\") (\"d\"/\"D\") mws) / \",\"");
        out.println("disjunction = (\"o\"/\"O\") (\"r\"/\"R\") mws");
        out.println("exclusion = (\"m\"/\"M\") (\"i\"/\"I\") (\"n\"/\"N\") (\"u\"/\"U\") (\"s\"/\"S\") mws");
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
        out.println("to = \"..\" / (mws (\"t\"/\"T\") (\"o\"/\"O\") mws)");
        out.println("many = \"*\" / ( (\"m\"/\"M\") (\"a\"/\"A\") (\"n\"/\"N\") (\"y\"/\"Y\"))");
        out.println("reverseFlag =  ( (\"r\"/\"R\") (\"e\"/\"E\") (\"v\"/\"V\") (\"e\"/\"E\") (\"r\"/\"R\") (\"s\"/\"S\") (\"e\"/\"E\") (\"o\"/\"O\") (\"f\"/\"F\")) / \"R\"");
        out.println("attributeOperator = descendantOrSelfOf / descendantOf ");
        out.println("attributeName = conceptReference / wildCard");
        out.println("expressionConstraintValue = simpleExpressionConstraint / \"(\" ws (refinedExpressionConstraint / compoundExpressionConstraint) ws \")\"");
        out.println("expressionComparisonOperator = \"=\" / \"!=\" / (\"n\"/\"N\") (\"o\"/\"O\") (\"t\"/\"T\") ws \"=\" / \"<>\"");
        out.println("numericComparisonOperator = \"=\" / \"!=\" / (\"n\"/\"N\") (\"o\"/\"O\") (\"t\"/\"T\") ws \"=\" / \"<>\" / \"<=\" / \"<\" / \">=\" / \">\"");
        out.println("stringComparisonOperator = \"=\" / \"!=\" / (\"n\"/\"N\") (\"o\"/\"O\") (\"t\"/\"T\") ws \"=\" / \"<>\"");
        out.println("numericValue =  \"#\" ( decimalValue / integerValue)");
        out.println("stringValue =  QM 1*(anyNonEscapedChar / escapedChar) QM ");
        out.println("integerValue = ( [\"-\"/\"+\"] digitNonZero *digit ) / zero");
        out.println("decimalValue = integerValue \".\" 1*digit");
        out.println("nonNegativeIntegerValue = (digitNonZero *digit ) / zero ");
        out.println("sctId = digitNonZero 5*17( digit )");
        out.println("ws = *( SP / HTAB / CR / LF )  ; optional white space");
        out.println("mws = 1*( SP / HTAB / CR / LF )  ; mandatory white space");
        out.println("SP = %x20  ; space");
        out.println("HTAB = %x09  ; tab");
        out.println("CR = %x0D  ; carriage return");
        out.println("LF = %x0A  ; line feed");
        out.println("QM = %x22  ; quotation mark     ");
        out.println("BS = %x5C  ; back slash");
        out.println("digit = %x30-39");
        out.println("zero = %x30");
        out.println("digitNonZero = %x31-39 ");
        out.println("nonwsNonPipe = %x21-7B / %x7D-7E / UTF8-2 / UTF8-3 / UTF8-4");
        out.println("anyNonEscapedChar = HTAB / CR / LF / %x20-21 / %x23-5B / %x5D-7E / UTF8-2 / UTF8-3 / UTF8-4");
        out.println("escapedChar = BS QM / BS BS");
        out.println("UTF8-2 = %xC2-DF UTF8-tail");
        out.println("UTF8-3 = %xE0 %xA0-BF UTF8-tail / %xE1-EC 2(UTF8-tail) / %xED %x80-9F UTF8-tail / %xEE-EF 2(UTF8-tail)");
        out.println("UTF8-4 = %xF0 %x90-BF 2(UTF8-tail) / %xF1-F3 3(UTF8-tail) / %xF4 %x80-8F 2(UTF8-tail)");
        out.println("UTF8-tail = %x80-BF");
    }
}
