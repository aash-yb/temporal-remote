This project show how to start a workflow using an external trigger. 

## Steps
1. Run temporal
```bash
temporal server start-dev
```

2. Run the `ExternalServer.java`'s main code.
3. Run worker's main code `ExternalTriggeredWorker.java`

4. Check that workflow has started using temporal UI - `http://localhost:8233/`

