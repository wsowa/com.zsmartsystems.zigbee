/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters;

import com.zsmartsystems.zigbee.ZigBeeDevice;
import com.zsmartsystems.zigbee.ZigBeeNetworkManager;
import com.zsmartsystems.zigbee.zcl.ZclAttribute;
import com.zsmartsystems.zigbee.zcl.ZclCluster;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <b>Analog Output (BACnet Regular)</b> cluster implementation (<i>Cluster ID 0x0604</i>).
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ZclAnalogOutputBaCnetRegularCluster extends ZclCluster {
    // Cluster ID
    public static final int CLUSTER_ID = 0x0604;

    // Cluster Name
    public static final String CLUSTER_NAME = "Analog Output (BACnet Regular)";

    // Attribute initialisation
    protected Map<Integer, ZclAttribute> initializeAttributes() {
        Map<Integer, ZclAttribute> attributeMap = new ConcurrentHashMap<Integer, ZclAttribute>(0);

        return attributeMap;
    }

    /**
     * Default constructor to create a Analog Output (BACnet Regular) cluster.
     *
     * @param zigbeeManager {@link ZigBeeNetworkManager}
     * @param zigbeeEndpoint the {@link ZigBeeDevice}
     */
    public ZclAnalogOutputBaCnetRegularCluster(final ZigBeeNetworkManager zigbeeManager, final ZigBeeDevice zigbeeEndpoint) {
        super(zigbeeManager, zigbeeEndpoint, CLUSTER_ID, CLUSTER_NAME);
    }

}
