package org.wangpai.demo.rmi.common;

import java.io.Serializable;

public interface Request extends Serializable {
    Object getData();
}
