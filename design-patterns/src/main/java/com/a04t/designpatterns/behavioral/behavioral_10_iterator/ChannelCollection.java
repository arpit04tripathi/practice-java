package com.a04t.designpatterns.behavioral.behavioral_10_iterator;

public interface ChannelCollection {
	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public ChannelIterator iterator(ChannelTypeEnum type);
}