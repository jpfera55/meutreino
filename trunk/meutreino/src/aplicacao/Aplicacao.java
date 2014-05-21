/**
 * 
 */
package aplicacao;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fachada.Fachada;
import usuario.model.Usuario;
import usuario.model.UsuarioNaoEncontradoException;



/**
 * @author Allan
 *
 */
public class Aplicacao {

	/**
	 * Programa GUI
	 */
	public Aplicacao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int s = 0;
		ArrayList<Usuario> lista;
		int idUsuario = 10, sexo, idade, tipo, altura,nivel = 0;
		String nome, apelido, email, senha, reSenha;
			
		Usuario usuario;
		
		while(true) {
			try {
					Fachada fachada = Fachada.getInstance();
					System.out.println("Escolha a Opção: ");
					System.out.println("1 - Cadastar Usuario");
					System.out.println("2 - Procurar Usuario");
					System.out.println("3 - Remover Usuario");
					System.out.println("4 - Atualizar Usuario");
					System.out.println("0 - Sair");
					s = in.nextInt();
					// Cadastrar Usuario
					if (s == 1) {
						System.out.print("Entre com o Nome: ");
						nome = in.next();
						System.out.print("Entre com o Apelido: ");
						apelido = in.next();
						System.out.print("- Sexo - \n"
								       + " 1 para Masculino  \n"
								       + " 2 para Feminino  :  ");
						sexo = in.nextInt();
						System.out.print("Entre com a Idade: ");
						idade = in.nextInt();
						System.out.print("Entre com a Altura em cm: ");
						altura = in.nextInt();
						System.out.print("- Tipo de Usuário - \n"
							       + " 1 para Adminstrador  \n"
							       + " 2 para Comum : ");
						tipo = in.nextInt();
						System.out.print("Entre com o email: ");
						email = in.next();
						System.out.print("Entre com a Senha: ");
						senha = in.next();
						System.out.print("Redigite a Senha: ");
						reSenha = in.next();
						
						// Cria a instância de usuario
						usuario = new Usuario(idUsuario, nome, apelido, tipo, email, senha, sexo, altura, idade, nivel);
						
						fachada.usuarioCadastrar(usuario);
						System.out.println(" \n Cliente Cadastrado com Sucesso! \n");
					}
					// Procurar Usuário
					else if (s == 2) {
						System.out.print("Entre com o idUsuario: ");
						idUsuario = in.nextInt();
						usuario = fachada.usuarioProcurar(idUsuario);
						System.out.println("Apelido: " + usuario.getIdUsuario() + 
								          "\n Email: " + usuario.getEmail()   +
								          "\n Idade: " + usuario.getIdade()   +
								          "\n Nivel: " + usuario.getNivel()	);
					}
					// Remover Usuario
					else if (s == 3) {
						System.out.print("Entre com o IdUsuario: ");
						idUsuario = in.nextInt();
						fachada.usuarioRemover(idUsuario);
						System.out.println("Usuario Removido com Sucesso");
					}
					// Atualizar Usuario
					else if (s == 4) {
						System.out.print("Entre com o IdUsuario: ");
						idUsuario = in.nextInt();
						usuario = fachada.usuarioProcurar(idUsuario);
						System.out.print("Entre com o Nome: ");
						nome = in.next();
						System.out.print("Entre com o Apelido: ");
						apelido = in.next();
						
						usuario.setNome(nome);
						usuario.setApelido(apelido);
						
						fachada.usuarioAtualizar(usuario);
						System.out.println("Usuário atualizado com sucesso");
					}
					// Limpando Buffer
					in.nextLine();
					if (s == 0) break;
			/*} catch (ClienteJaCadastradoException e) {
				System.out.println(e.getMessage());
				//break;
			} catch (RepositorioException e) {
				System.out.println(e.getMessage());
				break;*/
			} catch (UsuarioNaoEncontradoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				//break;
			/*} catch (InputMismatchException e) {
				System.out.println("Opção no menu inválido");
				//break;*/
			}catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		/*try {
			ConnectionManager.liberaRecursos();
		} catch (SQLException e) {}
		*/
		System.out.println("Fechou com sucesso");


	}

}
