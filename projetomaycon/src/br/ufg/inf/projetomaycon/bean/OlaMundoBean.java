package br.ufg.inf.projetomaycon.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 * @date 17/08/14
 * @author Maycon Spirlandelli
 * 
 * @link http://jamacedo.com/2010/04/java-server-faces-2-0-netbeans-primeiros-passos/
 */
@ManagedBean
public class OlaMundoBean {

    public String getHorario() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        return "Atualizado em " + sdf.format(new Date());
    }
}
