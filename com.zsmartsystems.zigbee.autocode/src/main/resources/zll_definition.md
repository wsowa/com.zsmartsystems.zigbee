# ZigBee Light Link [0xC05E]

# Commissioning

## Touchlink [0x1000]

### Received

#### Scan Command [0x00]

The scan request command frame is used to initiate a scan for other devices in the vicinity
of the originator. The information contained in this command frame relates to the scan
request initiator.

This  inter-PAN command  shall  be  formatted  according  to  the  general  inter-PAN  frame
format  with  the following clarifications. In the MAC header, the ACK request and destination
addressing mode sub-fields of the frame control field shall be set to 0 (no ACK requested)
and 0b10 (short network address), respectively, the destination address field shall be set
to 0xffff (broadcast network address) and the source PAN ID field shall be set to any value
in the range 0x0001 –0xfffe, if the device is factory new, or the PAN identifier of the device,
otherwise. In the APS header, the delivery mode sub-field of the frame control field shall be
set to 0b10 (broadcast). In the ZCL header, the direction sub-field of the frame control field
shall be set to 0 (client to server) and the command identifier shall be set to 0x00 (scan request).

|Field Name                 |Data Type                  |
|---------------------------|---------------------------|
|InterPan transaction ID    |Unsigned 32-bit integer    |
|ZigBee information         |8-bit bitmap               |
|Touchlink Information      |8-bit bitmap               |

#### Device Information Command [0x02]

The device information request command frame is used to request information regarding the
sub-devices of a remote device

#### Identify Command [0x06]

The identify request command frame is used to request that the recipient identifies itself
in some application specific way to aid with touchlinking

#### Reset to Factory New Command [0x07]

The reset to factory new request command frame is used to request that the recipient resets
itself back to its factory new state.

|Field Name                 |Data Type                  |
|---------------------------|---------------------------|
|InterPan transaction ID    |Unsigned 32-bit integer    |

##### InterPan transaction ID
The inter-PAN transaction identifier field is 32-bits in length
and specifies an identifier for the inter-PAN transaction. This
field shall contain a non-zero 32-bit random number and is used
to identify the current reset to factory new request.

#### Network Start Command [0x10]

The network start request command frame is used by a factory new initiator to form a
new network with a router.

#### Network Join Router Command [0x12]

The network join router request command frame is used by a non-factory-new initiator to
join a router to its network.

#### Network Join End Device Command [0x14]

The network join end device request command frame is used by a
non-factory-new initiator to join a factory new end device to its network.

#### Network Update Command [0x16]

The network update request command frame is used to attempt to bring
a router that may have missed a network update back onto the network.

#### Get Group Identifiers Command [0x41]

The get group identifiers request command is used to retrieve the actual
group identifiers that the endpoint is using in its multicast communication
in controlling different(remote) devices.

#### Get Endpoint List Command [0x42]

The get endpoint list request command is  used to retrieve addressing
information  for  each  endpoint the device is using in its unicast communication
in controlling different (remote) devices.

### Generated

#### Scan Response Command [0x01]

The scan response command frame is used to respond to the originator
of a scan request command frame with device details. The information
contained in this command frame relates to the target that is responding to
the scan request command frame.

#### Device Information Response Command [0x03]

The device information response command frame is used to return information
about the sub-devices sup-ported by a node

#### Network Start Response Command [0x11]

The network start response command frame is used by a router to respond to a
network start request command frame received from an end device.

#### Network Join Router Response Command [0x13]

The network join router response command frame is used by a router to respond
to a network join router request command frame received from a non-factory-new end device.

#### Network Join End Device Response Command [0x15]

The network join end device response command frame is used by a factory new end
device to respond to a network join end device request command frame received
from a non-factory new end device.

#### Endpoint Information Command [0x40]

The endpoint information command is used to inform the remote endpoint about the
general information of the local endpoint. This command may be a trigger for the remote
endpoint to get more information from the local device using the other commands described
in this cluster.

#### Get Endpoint List Response Command [0x42]

The get endpoint list response command allows a remote device to respond to the get
endpoint list request command.


