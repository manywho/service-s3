package com.manywho.services.s3.database;

import com.manywho.sdk.api.draw.content.Command;
import com.manywho.sdk.api.run.elements.type.ListFilter;
import com.manywho.sdk.api.run.elements.type.MObject;
import com.manywho.sdk.api.run.elements.type.ObjectDataType;
import com.manywho.sdk.services.database.ReadOnlyDatabase;
import com.manywho.sdk.services.types.system.$File;
import com.manywho.services.s3.ServiceConfiguration;
import com.manywho.services.s3.managers.FileManager;

import javax.inject.Inject;
import javax.ws.rs.NotSupportedException;
import java.util.List;

public class FileDatabase implements ReadOnlyDatabase<ServiceConfiguration, $File> {
    private FileManager fileManager;

    @Inject
    public FileDatabase(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public $File find(ServiceConfiguration configuration, ObjectDataType objectDataType, Command command, String id) {
        return fileManager.findFile(configuration, id);
    }

    @Override
    public List<$File> findAll(ServiceConfiguration configuration, ObjectDataType objectDataType, Command command, ListFilter listFilter, List<MObject> list) {
        throw new NotSupportedException("Listing all files is not yet supported in the S3 Service");
    }
}
