/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.touchlink;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Device Information Command value object class.
 * <p>
 * The device information request command frame is used to request information regarding the
 * sub-devices of a remote device
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class DeviceInformationCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public DeviceInformationCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 2;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(27);
        builder.append("DeviceInformationCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
