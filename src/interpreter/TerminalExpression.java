package interpreter;

import java.util.StringTokenizer;

/**
 * 终结符表达式，每个终结符都需要一个TerminalExpression
 * 此处String即为Context,上下文，包含解释器之外的一些全局信息
 */
public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()){
            String test = st.nextToken();
            if (test.equals(literal)){
                return true;
            }
        }
        return false;
    }
}
