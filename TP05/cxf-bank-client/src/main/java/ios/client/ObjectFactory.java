
package ios.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ios.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMoney_QNAME = new QName("http://bankInterface/", "addMoney");
    private final static QName _AddMoneyResponse_QNAME = new QName("http://bankInterface/", "addMoneyResponse");
    private final static QName _CloseAccount_QNAME = new QName("http://bankInterface/", "closeAccount");
    private final static QName _CloseAccountResponse_QNAME = new QName("http://bankInterface/", "closeAccountResponse");
    private final static QName _CreateAccount_QNAME = new QName("http://bankInterface/", "createAccount");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://bankInterface/", "createAccountResponse");
    private final static QName _CreateClient_QNAME = new QName("http://bankInterface/", "createClient");
    private final static QName _CreateClientResponse_QNAME = new QName("http://bankInterface/", "createClientResponse");
    private final static QName _DisplayDatabase_QNAME = new QName("http://bankInterface/", "displayDatabase");
    private final static QName _DisplayDatabaseResponse_QNAME = new QName("http://bankInterface/", "displayDatabaseResponse");
    private final static QName _DisplaySolde_QNAME = new QName("http://bankInterface/", "displaySolde");
    private final static QName _DisplaySoldeResponse_QNAME = new QName("http://bankInterface/", "displaySoldeResponse");
    private final static QName _EmptyDatabase_QNAME = new QName("http://bankInterface/", "emptyDatabase");
    private final static QName _EmptyDatabaseResponse_QNAME = new QName("http://bankInterface/", "emptyDatabaseResponse");
    private final static QName _EraseClient_QNAME = new QName("http://bankInterface/", "eraseClient");
    private final static QName _EraseClientResponse_QNAME = new QName("http://bankInterface/", "eraseClientResponse");
    private final static QName _RecoverAccount_QNAME = new QName("http://bankInterface/", "recoverAccount");
    private final static QName _RecoverAccountResponse_QNAME = new QName("http://bankInterface/", "recoverAccountResponse");
    private final static QName _RecoverClient_QNAME = new QName("http://bankInterface/", "recoverClient");
    private final static QName _RecoverClientResponse_QNAME = new QName("http://bankInterface/", "recoverClientResponse");
    private final static QName _RemoveMoney_QNAME = new QName("http://bankInterface/", "removeMoney");
    private final static QName _RemoveMoneyResponse_QNAME = new QName("http://bankInterface/", "removeMoneyResponse");
    private final static QName _VirementBetweenAcc_QNAME = new QName("http://bankInterface/", "virementBetweenAcc");
    private final static QName _VirementBetweenAccResponse_QNAME = new QName("http://bankInterface/", "virementBetweenAccResponse");
    private final static QName _VirementInternAcc_QNAME = new QName("http://bankInterface/", "virementInternAcc");
    private final static QName _VirementInternAccResponse_QNAME = new QName("http://bankInterface/", "virementInternAccResponse");
    private final static QName _ClientDoNotExistException_QNAME = new QName("http://bankInterface/", "ClientDoNotExistException");
    private final static QName _TypeOfAccountDoNotExistException_QNAME = new QName("http://bankInterface/", "TypeOfAccountDoNotExistException");
    private final static QName _TypeOfAccountAlreadyExistForClientException_QNAME = new QName("http://bankInterface/", "TypeOfAccountAlreadyExistForClientException");
    private final static QName _ClientAlreadyExistException_QNAME = new QName("http://bankInterface/", "ClientAlreadyExistException");
    private final static QName _SoldeIsNotCorrectException_QNAME = new QName("http://bankInterface/", "SoldeIsNotCorrectException");
    private final static QName _AccountDoNoExistException_QNAME = new QName("http://bankInterface/", "AccountDoNoExistException");
    private final static QName _AccountInRedException_QNAME = new QName("http://bankInterface/", "AccountInRedException");
    private final static QName _AccountNotLinkedToTheClientException_QNAME = new QName("http://bankInterface/", "AccountNotLinkedToTheClientException");
    private final static QName _ClientStillHasAnAccountException_QNAME = new QName("http://bankInterface/", "ClientStillHasAnAccountException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ios.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMoney }
     * 
     */
    public AddMoney createAddMoney() {
        return new AddMoney();
    }

    /**
     * Create an instance of {@link AddMoneyResponse }
     * 
     */
    public AddMoneyResponse createAddMoneyResponse() {
        return new AddMoneyResponse();
    }

    /**
     * Create an instance of {@link CloseAccount }
     * 
     */
    public CloseAccount createCloseAccount() {
        return new CloseAccount();
    }

    /**
     * Create an instance of {@link CloseAccountResponse }
     * 
     */
    public CloseAccountResponse createCloseAccountResponse() {
        return new CloseAccountResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link DisplayDatabase }
     * 
     */
    public DisplayDatabase createDisplayDatabase() {
        return new DisplayDatabase();
    }

    /**
     * Create an instance of {@link DisplayDatabaseResponse }
     * 
     */
    public DisplayDatabaseResponse createDisplayDatabaseResponse() {
        return new DisplayDatabaseResponse();
    }

    /**
     * Create an instance of {@link DisplaySolde }
     * 
     */
    public DisplaySolde createDisplaySolde() {
        return new DisplaySolde();
    }

    /**
     * Create an instance of {@link DisplaySoldeResponse }
     * 
     */
    public DisplaySoldeResponse createDisplaySoldeResponse() {
        return new DisplaySoldeResponse();
    }

    /**
     * Create an instance of {@link EmptyDatabase }
     * 
     */
    public EmptyDatabase createEmptyDatabase() {
        return new EmptyDatabase();
    }

    /**
     * Create an instance of {@link EmptyDatabaseResponse }
     * 
     */
    public EmptyDatabaseResponse createEmptyDatabaseResponse() {
        return new EmptyDatabaseResponse();
    }

    /**
     * Create an instance of {@link EraseClient }
     * 
     */
    public EraseClient createEraseClient() {
        return new EraseClient();
    }

    /**
     * Create an instance of {@link EraseClientResponse }
     * 
     */
    public EraseClientResponse createEraseClientResponse() {
        return new EraseClientResponse();
    }

    /**
     * Create an instance of {@link RecoverAccount }
     * 
     */
    public RecoverAccount createRecoverAccount() {
        return new RecoverAccount();
    }

    /**
     * Create an instance of {@link RecoverAccountResponse }
     * 
     */
    public RecoverAccountResponse createRecoverAccountResponse() {
        return new RecoverAccountResponse();
    }

    /**
     * Create an instance of {@link RecoverClient }
     * 
     */
    public RecoverClient createRecoverClient() {
        return new RecoverClient();
    }

    /**
     * Create an instance of {@link RecoverClientResponse }
     * 
     */
    public RecoverClientResponse createRecoverClientResponse() {
        return new RecoverClientResponse();
    }

    /**
     * Create an instance of {@link RemoveMoney }
     * 
     */
    public RemoveMoney createRemoveMoney() {
        return new RemoveMoney();
    }

    /**
     * Create an instance of {@link RemoveMoneyResponse }
     * 
     */
    public RemoveMoneyResponse createRemoveMoneyResponse() {
        return new RemoveMoneyResponse();
    }

    /**
     * Create an instance of {@link VirementBetweenAcc }
     * 
     */
    public VirementBetweenAcc createVirementBetweenAcc() {
        return new VirementBetweenAcc();
    }

    /**
     * Create an instance of {@link VirementBetweenAccResponse }
     * 
     */
    public VirementBetweenAccResponse createVirementBetweenAccResponse() {
        return new VirementBetweenAccResponse();
    }

    /**
     * Create an instance of {@link VirementInternAcc }
     * 
     */
    public VirementInternAcc createVirementInternAcc() {
        return new VirementInternAcc();
    }

    /**
     * Create an instance of {@link VirementInternAccResponse }
     * 
     */
    public VirementInternAccResponse createVirementInternAccResponse() {
        return new VirementInternAccResponse();
    }

    /**
     * Create an instance of {@link ClientDoNotExistException }
     * 
     */
    public ClientDoNotExistException createClientDoNotExistException() {
        return new ClientDoNotExistException();
    }

    /**
     * Create an instance of {@link TypeOfAccountDoNotExistException }
     * 
     */
    public TypeOfAccountDoNotExistException createTypeOfAccountDoNotExistException() {
        return new TypeOfAccountDoNotExistException();
    }

    /**
     * Create an instance of {@link TypeOfAccountAlreadyExistForClientException }
     * 
     */
    public TypeOfAccountAlreadyExistForClientException createTypeOfAccountAlreadyExistForClientException() {
        return new TypeOfAccountAlreadyExistForClientException();
    }

    /**
     * Create an instance of {@link ClientAlreadyExistException }
     * 
     */
    public ClientAlreadyExistException createClientAlreadyExistException() {
        return new ClientAlreadyExistException();
    }

    /**
     * Create an instance of {@link SoldeIsNotCorrectException }
     * 
     */
    public SoldeIsNotCorrectException createSoldeIsNotCorrectException() {
        return new SoldeIsNotCorrectException();
    }

    /**
     * Create an instance of {@link AccountDoNoExistException }
     * 
     */
    public AccountDoNoExistException createAccountDoNoExistException() {
        return new AccountDoNoExistException();
    }

    /**
     * Create an instance of {@link AccountInRedException }
     * 
     */
    public AccountInRedException createAccountInRedException() {
        return new AccountInRedException();
    }

    /**
     * Create an instance of {@link AccountNotLinkedToTheClientException }
     * 
     */
    public AccountNotLinkedToTheClientException createAccountNotLinkedToTheClientException() {
        return new AccountNotLinkedToTheClientException();
    }

    /**
     * Create an instance of {@link ClientStillHasAnAccountException }
     * 
     */
    public ClientStillHasAnAccountException createClientStillHasAnAccountException() {
        return new ClientStillHasAnAccountException();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "addMoney")
    public JAXBElement<AddMoney> createAddMoney(AddMoney value) {
        return new JAXBElement<AddMoney>(_AddMoney_QNAME, AddMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "addMoneyResponse")
    public JAXBElement<AddMoneyResponse> createAddMoneyResponse(AddMoneyResponse value) {
        return new JAXBElement<AddMoneyResponse>(_AddMoneyResponse_QNAME, AddMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "closeAccount")
    public JAXBElement<CloseAccount> createCloseAccount(CloseAccount value) {
        return new JAXBElement<CloseAccount>(_CloseAccount_QNAME, CloseAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "closeAccountResponse")
    public JAXBElement<CloseAccountResponse> createCloseAccountResponse(CloseAccountResponse value) {
        return new JAXBElement<CloseAccountResponse>(_CloseAccountResponse_QNAME, CloseAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "displayDatabase")
    public JAXBElement<DisplayDatabase> createDisplayDatabase(DisplayDatabase value) {
        return new JAXBElement<DisplayDatabase>(_DisplayDatabase_QNAME, DisplayDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "displayDatabaseResponse")
    public JAXBElement<DisplayDatabaseResponse> createDisplayDatabaseResponse(DisplayDatabaseResponse value) {
        return new JAXBElement<DisplayDatabaseResponse>(_DisplayDatabaseResponse_QNAME, DisplayDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplaySolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "displaySolde")
    public JAXBElement<DisplaySolde> createDisplaySolde(DisplaySolde value) {
        return new JAXBElement<DisplaySolde>(_DisplaySolde_QNAME, DisplaySolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplaySoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "displaySoldeResponse")
    public JAXBElement<DisplaySoldeResponse> createDisplaySoldeResponse(DisplaySoldeResponse value) {
        return new JAXBElement<DisplaySoldeResponse>(_DisplaySoldeResponse_QNAME, DisplaySoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "emptyDatabase")
    public JAXBElement<EmptyDatabase> createEmptyDatabase(EmptyDatabase value) {
        return new JAXBElement<EmptyDatabase>(_EmptyDatabase_QNAME, EmptyDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "emptyDatabaseResponse")
    public JAXBElement<EmptyDatabaseResponse> createEmptyDatabaseResponse(EmptyDatabaseResponse value) {
        return new JAXBElement<EmptyDatabaseResponse>(_EmptyDatabaseResponse_QNAME, EmptyDatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EraseClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "eraseClient")
    public JAXBElement<EraseClient> createEraseClient(EraseClient value) {
        return new JAXBElement<EraseClient>(_EraseClient_QNAME, EraseClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EraseClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "eraseClientResponse")
    public JAXBElement<EraseClientResponse> createEraseClientResponse(EraseClientResponse value) {
        return new JAXBElement<EraseClientResponse>(_EraseClientResponse_QNAME, EraseClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoverAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "recoverAccount")
    public JAXBElement<RecoverAccount> createRecoverAccount(RecoverAccount value) {
        return new JAXBElement<RecoverAccount>(_RecoverAccount_QNAME, RecoverAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoverAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "recoverAccountResponse")
    public JAXBElement<RecoverAccountResponse> createRecoverAccountResponse(RecoverAccountResponse value) {
        return new JAXBElement<RecoverAccountResponse>(_RecoverAccountResponse_QNAME, RecoverAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoverClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "recoverClient")
    public JAXBElement<RecoverClient> createRecoverClient(RecoverClient value) {
        return new JAXBElement<RecoverClient>(_RecoverClient_QNAME, RecoverClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoverClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "recoverClientResponse")
    public JAXBElement<RecoverClientResponse> createRecoverClientResponse(RecoverClientResponse value) {
        return new JAXBElement<RecoverClientResponse>(_RecoverClientResponse_QNAME, RecoverClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "removeMoney")
    public JAXBElement<RemoveMoney> createRemoveMoney(RemoveMoney value) {
        return new JAXBElement<RemoveMoney>(_RemoveMoney_QNAME, RemoveMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "removeMoneyResponse")
    public JAXBElement<RemoveMoneyResponse> createRemoveMoneyResponse(RemoveMoneyResponse value) {
        return new JAXBElement<RemoveMoneyResponse>(_RemoveMoneyResponse_QNAME, RemoveMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementBetweenAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "virementBetweenAcc")
    public JAXBElement<VirementBetweenAcc> createVirementBetweenAcc(VirementBetweenAcc value) {
        return new JAXBElement<VirementBetweenAcc>(_VirementBetweenAcc_QNAME, VirementBetweenAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementBetweenAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "virementBetweenAccResponse")
    public JAXBElement<VirementBetweenAccResponse> createVirementBetweenAccResponse(VirementBetweenAccResponse value) {
        return new JAXBElement<VirementBetweenAccResponse>(_VirementBetweenAccResponse_QNAME, VirementBetweenAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementInternAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "virementInternAcc")
    public JAXBElement<VirementInternAcc> createVirementInternAcc(VirementInternAcc value) {
        return new JAXBElement<VirementInternAcc>(_VirementInternAcc_QNAME, VirementInternAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementInternAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "virementInternAccResponse")
    public JAXBElement<VirementInternAccResponse> createVirementInternAccResponse(VirementInternAccResponse value) {
        return new JAXBElement<VirementInternAccResponse>(_VirementInternAccResponse_QNAME, VirementInternAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDoNotExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "ClientDoNotExistException")
    public JAXBElement<ClientDoNotExistException> createClientDoNotExistException(ClientDoNotExistException value) {
        return new JAXBElement<ClientDoNotExistException>(_ClientDoNotExistException_QNAME, ClientDoNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOfAccountDoNotExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "TypeOfAccountDoNotExistException")
    public JAXBElement<TypeOfAccountDoNotExistException> createTypeOfAccountDoNotExistException(TypeOfAccountDoNotExistException value) {
        return new JAXBElement<TypeOfAccountDoNotExistException>(_TypeOfAccountDoNotExistException_QNAME, TypeOfAccountDoNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOfAccountAlreadyExistForClientException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "TypeOfAccountAlreadyExistForClientException")
    public JAXBElement<TypeOfAccountAlreadyExistForClientException> createTypeOfAccountAlreadyExistForClientException(TypeOfAccountAlreadyExistForClientException value) {
        return new JAXBElement<TypeOfAccountAlreadyExistForClientException>(_TypeOfAccountAlreadyExistForClientException_QNAME, TypeOfAccountAlreadyExistForClientException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientAlreadyExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "ClientAlreadyExistException")
    public JAXBElement<ClientAlreadyExistException> createClientAlreadyExistException(ClientAlreadyExistException value) {
        return new JAXBElement<ClientAlreadyExistException>(_ClientAlreadyExistException_QNAME, ClientAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoldeIsNotCorrectException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "SoldeIsNotCorrectException")
    public JAXBElement<SoldeIsNotCorrectException> createSoldeIsNotCorrectException(SoldeIsNotCorrectException value) {
        return new JAXBElement<SoldeIsNotCorrectException>(_SoldeIsNotCorrectException_QNAME, SoldeIsNotCorrectException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDoNoExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "AccountDoNoExistException")
    public JAXBElement<AccountDoNoExistException> createAccountDoNoExistException(AccountDoNoExistException value) {
        return new JAXBElement<AccountDoNoExistException>(_AccountDoNoExistException_QNAME, AccountDoNoExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInRedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "AccountInRedException")
    public JAXBElement<AccountInRedException> createAccountInRedException(AccountInRedException value) {
        return new JAXBElement<AccountInRedException>(_AccountInRedException_QNAME, AccountInRedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotLinkedToTheClientException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "AccountNotLinkedToTheClientException")
    public JAXBElement<AccountNotLinkedToTheClientException> createAccountNotLinkedToTheClientException(AccountNotLinkedToTheClientException value) {
        return new JAXBElement<AccountNotLinkedToTheClientException>(_AccountNotLinkedToTheClientException_QNAME, AccountNotLinkedToTheClientException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientStillHasAnAccountException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankInterface/", name = "ClientStillHasAnAccountException")
    public JAXBElement<ClientStillHasAnAccountException> createClientStillHasAnAccountException(ClientStillHasAnAccountException value) {
        return new JAXBElement<ClientStillHasAnAccountException>(_ClientStillHasAnAccountException_QNAME, ClientStillHasAnAccountException.class, null, value);
    }

}
