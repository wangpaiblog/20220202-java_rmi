package org.wangpai.demo.rmi.common;

import java.io.Serializable;

public interface Response extends Serializable {
    Object getData();
}
