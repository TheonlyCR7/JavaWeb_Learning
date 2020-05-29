## Internet工作原理

-   Internet是由一些通讯介质，如光纤、微波、电缆、普通电话线等，将各种类型的计算机联系在一起，并统一采用TCP/IP协议(传输控制协议/网际互联协议) 标准，而互相联通、共享信息资源的计算机体系。Internet是一个跨越不同国家、地区和区域的计算机网相互联结，彼此通讯的集合。对于Internet用户来说，这些网好像就是一个天衣无缝的整体。


-   计算机网是由许多计算机组成的，要在两个网上的计算机之间传输数据，必须做两件事情：**保证数据传输到目的地的正确地址和保证数据迅速可靠地传输的措施**，强调这两点是因为数据在传输过程中很容易传错或丢失。


-   Internet使用一种专门的计算机语言(协议)以保证数据能够安全可靠地到达指定的目的地。这种语言分为两部分，即**TCP**(Transfer Control Protocol，传输控制协议)和**IP** (Internet Protocol，网络连接协议)，通常将他们放在一起，用TCP/IP表示(关于这些协议将在下节中具体介绍)。


-   当一个Internet用户给其他机器发送一个文本时，TCP将该文本分解成若干个小数据包，再加上一些特定的信息(可以类比为运输货物的装箱单)，以便接收方的机器可以判断传输是正确无误的，由IP在数据包上标上有关地址信息。连续不断的TCP/IP数据包可以经由不同的路由到达同一个地点。有个专门的机器，即路由器，位于网络的交叉点上，它决定数据包的最佳传输途径，以便有效的分散Internet的各种业务量载荷，避免系统某一部分过于繁忙而发生“堵塞”。当TCP/IP数据包到达目的地后，计算机将去掉TP的地址标志，利用TCP的“装箱单”检查数据在传输过程中是否有损失，在此基础上并将各数据包重新组合成原文本文件。如果接收方发现有损坏的数据包，则要求发送端重新发送被损坏的数据包。

-   最底层的是互联网协议，是用于报文交换网络的一种面向数据的协议，这一协议定义了数据包在网际传送时的格式。当前使用最多的是IPv4版本，这一版本中用32位定义IP地址，尽管地址总数达到43亿，但是仍然不能满足现今全球网络飞速发展的需求，因此IPv6版本应运而生。在IPv6版本中，IP地址共有128位，“几乎可以为地球上每一粒沙子分配一个IPv6地址”。IPv6当前并没有普及，许多互联网服务提供商并不支持IPv6协议的连接。但是，可以预见，将来在IPv6的帮助下，任何家用电器都有可能连入互联网。


-   中间层是UDP协议和TCP协议，它们用于控制数据流的传输。UDP是一种不可靠的数据流传输协议，仅为网络层和应用层之间提供简单的接口。而TCP协议则具有高的可靠性，通过为数据报加入额外信息，并提供重发机制，它能够保证数据不丢包、没有冗余包以及保证数据包的顺序。对于一些需要高可靠性的应用，可以选择TCP协议；而相反，对于性能优先考虑的应用如流媒体等，则可以选择UDP协议。


-   最顶层的是一些应用层协议，这些协议定义了一些用于通用应用的数据报结构，包括FTP及HTTP等。