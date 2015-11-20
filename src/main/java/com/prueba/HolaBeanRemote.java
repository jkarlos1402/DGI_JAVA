package com.prueba;

import javax.ejb.Remote;

@Remote
public interface HolaBeanRemote {
    public String diHola();
}
