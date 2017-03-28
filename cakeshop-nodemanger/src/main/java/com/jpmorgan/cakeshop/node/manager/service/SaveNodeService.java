package com.jpmorgan.cakeshop.node.manager.service;

import com.jpmorgan.cakeshop.node.manager.db.entity.RemoteNode;
import java.util.List;

public interface SaveNodeService {

    public void insert(RemoteNode node);

    public void update(RemoteNode node);

    public RemoteNode getNode(String id);

    public List<RemoteNode> getRemoteNodesList();
}
