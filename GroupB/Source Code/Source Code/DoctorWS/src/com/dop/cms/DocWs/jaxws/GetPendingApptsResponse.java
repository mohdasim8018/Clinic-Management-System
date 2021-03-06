
package com.dop.cms.DocWs.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPendingApptsResponse", namespace = "http://DocWs.cms.dop.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPendingApptsResponse", namespace = "http://DocWs.cms.dop.com/")
public class GetPendingApptsResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private com.dop.cms.data.DocPatApptDetails[] _return;

    /**
     * 
     * @return
     *     returns DocPatApptDetails[]
     */
    public com.dop.cms.data.DocPatApptDetails[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.dop.cms.data.DocPatApptDetails[] _return) {
        this._return = _return;
    }

}
