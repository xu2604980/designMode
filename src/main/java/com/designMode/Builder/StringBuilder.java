
package com.designMode.Builder;

public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
